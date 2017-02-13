package service.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by root on 17-2-11.
 */
public class SubmitInfoAction extends ActionSupport{
    private String tel;

    public String  getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(tel);
        return "OK";
    }
}
