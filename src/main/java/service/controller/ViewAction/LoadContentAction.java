package service.controller.ViewAction;

import biz.ContentBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import entity.Page;
import entity.ShowInfoEntity;
import service.serviceInter.ContentService;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class LoadContentAction extends ActionSupport {
    private List<ShowInfoEntity> listIndexInfo;
    private  Page p = new Page();

    public Page getP() {
        return p;
    }

    public void setP(Page p) {
        this.p = p;
    }

    public List<ShowInfoEntity> getListIndexInfo() {
        return listIndexInfo;
    }

    public void setListIndexInfo(List<ShowInfoEntity> listIndexInfo) {
        this.listIndexInfo = listIndexInfo;
    }

    //    set注入方式
    private ContentService iaction;

    public void setIaction(ContentService iaction) {
        this.iaction = iaction;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("yeshu："+p.getPage());
        listIndexInfo = iaction.loadAllLoseInfo(p);
        System.out.println("daxiao:"+listIndexInfo.size());
        return "index_info";
    }
}
