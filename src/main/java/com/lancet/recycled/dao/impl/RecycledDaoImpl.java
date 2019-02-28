package com.lancet.recycled.dao.impl;

import com.lancet.base.dao.impl.BaseDaoImpl;
import com.lancet.recycled.dao.RecycledDao;
import com.lancet.recycled.entity.Recycled;
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
public class RecycledDaoImpl extends BaseDaoImpl implements RecycledDao {
    @Override
    public void add(Recycled recycled) {
        Session session = this.getSessionFactory().openSession();
        session.save(recycled);
        session.close();
    }

    @Override
    public void update(Recycled recycled) {
        Session session = this.getSessionFactory().openSession();
        session.update(recycled);
        session.close();
    }

    @Override
    public void delete(Recycled recycled) {
        Session session = this.getSessionFactory().openSession();
        session.delete(recycled);
        session.close();
    }

    @Override
    public Recycled findById(String id) {
        Recycled result = null;
        String hql = "from Recycled where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<Recycled> recycleds = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(recycleds)) {
            result = recycleds.get(0);
        }
        return result;
    }

    @Override
    public List<Recycled> findByHql(String hql, Map<String, Object> parameters) {
        List<Recycled> result = null;
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
