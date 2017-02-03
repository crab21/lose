package com.wpy.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;
import com.wpy.dao.UserDao;

/**
 * Created by root on 17-1-30.
 */
public class UserAction extends ActionSupport{
    private String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
            list= new UserDao().getUserName();
            System.out.println(list);
        return SUCCESS;
    }
}
