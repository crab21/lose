package com.wpy.dao;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BaseDao {
	private Connection co = null;
	private PreparedStatement pste = null;
	private ResultSet re = null;
	private List params = null;
	

	public void setParms(List p){
		this.params = p;
	}

	public void setPste(List p, PreparedStatement pst) throws SQLException{
		for(int i = 0; i < p.size(); ++i){
			pst.setObject(i+1, p.get(i));
		}
	}
	private static final String ClassName = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/lose";
	private static final String usr = "root";
	private static final String password ="root";

	public void conn(){
		try {
			Class.forName(ClassName);
			co = DriverManager.getConnection(URL, usr, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public int executeUpdate(String sql){
		conn();
		try {

			pste = co.prepareStatement(sql);
			if(params != null){
				setPste(params, pste);
			}
			return pste.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		} finally {
			this.close();
		}
	}

	public ResultSet executeQuery(String sql){
		conn();
		try {
			pste = co.prepareStatement(sql);
			if(params != null){
				setPste(params, pste);
			}
			return pste.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public List executeQuery(String sql, Class cls){
		conn();
		List list = new ArrayList();
		try {
			pste = co.prepareStatement(sql);
			if(params != null){
				setPste(params, pste);
			}
			ResultSet rs = pste.executeQuery();
			if(cls == null){
				if(rs.next()){
					list.add(rs.getInt(1));
				}
			}else{
				while(rs.next()){
					Object obj = cls.newInstance();
					java.lang.reflect.Field[] fe = cls.getDeclaredFields();
					for (java.lang.reflect.Field f : fe) {
						String fname = f.getName();
						Method m = cls.getDeclaredMethod("set"+fname.substring(0, 1).toUpperCase()+fname.substring(1), new Class[]{f.getType()});
						m.invoke(obj, rs.getObject(fname));
					}
					list.add(obj);
				}	
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();	
		}finally {
			this.close();
		}
		return list;
	}

	public void close(){
		try {
			if(re != null){
				re.close();
			}
			if(pste != null){
				pste.close();
			}

			if(co != null){
				co.close();
			}


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}