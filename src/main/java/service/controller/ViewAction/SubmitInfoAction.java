package service.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;
import entity.SubmitInfo;

/**
 * Created by root on 17-2-11.
 */
public class SubmitInfoAction extends ActionSupport{
  private SubmitInfo sub;

    public SubmitInfo getSub() {
        return sub;
    }

    public void setSub(SubmitInfo sub) {
        this.sub = sub;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(sub.getLose_type());
        System.out.println(sub.getLose_name());
        System.out.println(sub.getLose_location());
        System.out.println(sub.getLose_info());
        System.out.println(sub.getLose_phone());

        return "ok";
    }
}
