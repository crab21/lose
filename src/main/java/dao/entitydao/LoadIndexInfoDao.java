package dao.entitydao;

import entity.Page;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by root on 17-2-4.
 */
public class LoadIndexInfoDao extends HibernateDaoSupport {

    public List loadIndexInfo(Page p) {

        Session session = this.getSessionFactory().openSession();
//        List list = super.getHibernateTemplate().find("from entity.ShowInfoEntity");
        String hql = "from entity.ShowInfoEntity b where b.lcid=0";

//        分页查询
        System.out.println(p.getPage()+"-----------");
        Query query = session.createQuery(hql);
        query.setFirstResult(p.getpSize() * (p.getPage() - 1));
        query.setMaxResults(p.getpSize());

        List list = query.list();

        session.close();
        return list;
    }
}
