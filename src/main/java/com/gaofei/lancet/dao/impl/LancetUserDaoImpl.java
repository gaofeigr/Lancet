package com.gaofei.lancet.dao.impl;

import com.gaofei.lancet.dao.LancetUserDao;
import com.gaofei.lancet.entity.LancetUser;
import com.gaofei.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户Dao实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository
public class LancetUserDaoImpl extends HibernateDaoSupport implements LancetUserDao {
    @Override
    public void add(LancetUser lancetUser) {
        Session session = this.getSessionFactory().openSession();
        session.save(lancetUser);
        session.close();
    }

    @Override
    public void update(LancetUser lancetUser) {
        Session session = this.getSessionFactory().openSession();
        session.update(lancetUser);
        session.close();
    }

    @Override
    public void delete(LancetUser lancetUser) {
        Session session = this.getSessionFactory().openSession();
        session.delete(lancetUser);
        session.close();
    }

    @Override
    public LancetUser findById(String id) {
        LancetUser result = null;
        String hql = "from LancetUser where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<LancetUser> lancetUsers = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(lancetUsers)) {
            result = lancetUsers.get(0);
        }
        return result;
    }

    @Override
    public List<LancetUser> findByHql(String hql, Map<String, Object> parameters) {
        List<LancetUser> result = null;
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
