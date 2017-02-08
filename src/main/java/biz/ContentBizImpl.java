package biz;

import dao.entitydao.LoadIndexInfoDao;
import entity.Page;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class ContentBizImpl implements ContentBiz {
    private LoadIndexInfoDao idao;

    public int PageTotal() {
        return idao.getPTotal();
    }

    public void setIdao(LoadIndexInfoDao idao) {
        this.idao = idao;
    }

    public List getIndexInfo(Page p) {
        return idao.loadIndexInfo(p);
    }
}
