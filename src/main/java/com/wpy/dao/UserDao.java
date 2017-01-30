package com.wpy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by root on 17-1-30.
 */
public class UserDao extends BaseDao {
    public String getUserName() {
        String sql = "select * from test";
        ResultSet resultSet = super.executeQuery(sql);

        try {
            while (resultSet.next()) {
                return resultSet.getString("username");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
