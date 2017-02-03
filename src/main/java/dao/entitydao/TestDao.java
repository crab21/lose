package dao.entitydao;


import entity.TestEntity;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by root on 17-2-3.
 */
public class TestDao extends HibernateDaoSupport {
    public String getTest() {
        List list = super.getHibernateTemplate().find("from entity.TestEntity");
        TestEntity te =(TestEntity)list.get(0);

        return te.getUsername();
    }
}
