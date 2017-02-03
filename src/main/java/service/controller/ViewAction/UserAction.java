package service.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.entitydao.TestDao;

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
    private TestDao te ;

    public void setTe(TestDao te) {
        this.te = te;
    }

    @Override
    public String execute() throws Exception {
            //list= new UserDao().getUserName();
        list = te.getTest();
            System.out.println(list);
        return SUCCESS;
    }
}
