package service.controller.ViewAction;

import com.opensymphony.xwork2.ActionSupport;
import entity.Page;
import entity.ShowInfoEntity;
import org.apache.log4j.Logger;
import service.serviceInter.ContentService;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class LoadContentAction extends ActionSupport {
    private List<ShowInfoEntity> listIndexInfo;
    private Page p = new Page();

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

    private static Logger logger = Logger.getLogger(LoadContentAction.class);
//    private static Logger logger = Logger.getLogger(LoadContentAction.class.getName());

    /*
    加载主页的内容的
    配合【加载更多】的按钮使用的
 */
    @Override
    public String execute() throws Exception {
        try {
            p.setTotal(iaction.getPageTotal());
            listIndexInfo = iaction.loadAllLoseInfo(p);
        } catch (Exception e) {
//            logger.error(e.printStackTrace());
            logger.error(e.getMessage());
        }

        return "index_info";
    }
}
