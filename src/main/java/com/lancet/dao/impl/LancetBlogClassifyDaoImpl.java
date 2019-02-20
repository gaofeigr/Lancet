package com.lancet.dao.impl;

import com.lancet.dao.LancetBlogClassifyDao;
import com.lancet.entity.LancetBlogClassify;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客分类Dao实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository
public class LancetBlogClassifyDaoImpl extends HibernateDaoSupport implements LancetBlogClassifyDao {
    @Override
    public void add(LancetBlogClassify lancetBlogClassify) {
        Session session = this.getSessionFactory().openSession();
        session.save(lancetBlogClassify);
        session.close();
    }

    @Override
    public void update(LancetBlogClassify lancetBlogClassify) {
        Session session = this.getSessionFactory().openSession();
        session.update(lancetBlogClassify);
        session.close();
    }

    @Override
    public void delete(LancetBlogClassify lancetBlogClassify) {
        Session session = this.getSessionFactory().openSession();
        session.delete(lancetBlogClassify);
        session.close();
    }

    @Override
    public LancetBlogClassify findById(String id) {
        LancetBlogClassify result = null;
        String hql = "from LancetBlogClassify where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<LancetBlogClassify> lancetBlogs = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(lancetBlogs)) {
            result = lancetBlogs.get(0);
        }
        return result;
    }

    @Override
    public List<LancetBlogClassify> findByHql(String hql, Map<String, Object> parameters) {
        List<LancetBlogClassify> result = null;
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
