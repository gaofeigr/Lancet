package com.lancet.dao.impl;

import com.lancet.dao.LancetBlogDao;
import com.lancet.entity.LancetBlog;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客Dao实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository
public class LancetBlogDaoImpl extends HibernateDaoSupport implements LancetBlogDao {
    @Override
    public void add(LancetBlog lancetBlog) {
        Session session = this.getSessionFactory().openSession();
        session.save(lancetBlog);
        session.close();
    }

    @Override
    public void update(LancetBlog lancetBlog) {
        Session session = this.getSessionFactory().openSession();
        session.update(lancetBlog);
        session.close();
    }

    @Override
    public void delete(LancetBlog lancetBlog) {
        Session session = this.getSessionFactory().openSession();
        session.delete(lancetBlog);
        session.close();
    }

    @Override
    public LancetBlog findById(String id) {
        LancetBlog result = null;
        String hql = "from LancetBlog where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<LancetBlog> lancetBlogs = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(lancetBlogs)) {
            result = lancetBlogs.get(0);
        }
        return result;
    }

    @Override
    public List<LancetBlog> findByHql(String hql, Map<String, Object> parameters) {
        List<LancetBlog> result = null;
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
