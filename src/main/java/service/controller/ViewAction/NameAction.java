package service.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by root on 17-1-31.
 */
public class NameAction extends ActionSupport {
    private String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        list = "hehe";
        return "index_info";

    }
}





