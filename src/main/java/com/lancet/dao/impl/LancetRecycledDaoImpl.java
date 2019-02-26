package com.lancet.dao.impl;

import com.lancet.dao.LancetRecycledDao;
import com.lancet.entity.LancetRecycled;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 回收站Dao实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository
public class LancetRecycledDaoImpl extends BaseDaoImpl implements LancetRecycledDao {
    @Override
    public void add(LancetRecycled lancetRecycled) {
        Session session = this.getSessionFactory().openSession();
        session.save(lancetRecycled);
        session.close();
    }

    @Override
    public void update(LancetRecycled lancetRecycled) {
        Session session = this.getSessionFactory().openSession();
        session.update(lancetRecycled);
        session.close();
    }

    @Override
    public void delete(LancetRecycled lancetRecycled) {
        Session session = this.getSessionFactory().openSession();
        session.delete(lancetRecycled);
        session.close();
    }

    @Override
    public LancetRecycled findById(String id) {
        LancetRecycled result = null;
        String hql = "from LancetRecycled where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<LancetRecycled> lancetRecycleds = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(lancetRecycleds)) {
            result = lancetRecycleds.get(0);
        }
        return result;
    }

    @Override
    public List<LancetRecycled> findByHql(String hql, Map<String, Object> parameters) {
        List<LancetRecycled> result = null;
        Session session = this.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        for (String key : parameters.keySet()) {
            query.setParameter(key, parameters.get(key));
        }
        session.close();
        result = query.list();
        return result;
    }
}
