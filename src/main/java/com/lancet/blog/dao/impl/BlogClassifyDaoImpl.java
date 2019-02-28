package com.lancet.blog.dao.impl;

import com.lancet.base.dao.impl.BaseDaoImpl;
import com.lancet.blog.dao.BlogClassifyDao;
import com.lancet.blog.entity.BlogClassify;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
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
public class BlogClassifyDaoImpl extends BaseDaoImpl implements BlogClassifyDao {
    @Override
    public void add(BlogClassify blogClassify) {
        Session session = this.getSessionFactory().openSession();
        session.save(blogClassify);
        session.close();
    }

    @Override
    public void update(BlogClassify blogClassify) {
        Session session = this.getSessionFactory().openSession();
        session.update(blogClassify);
        session.close();
    }

    @Override
    public void delete(BlogClassify blogClassify) {
        Session session = this.getSessionFactory().openSession();
        session.delete(blogClassify);
        session.close();
    }

    @Override
    public BlogClassify findById(String id) {
        BlogClassify result = null;
        String hql = "from BlogClassify where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<BlogClassify> blogs = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(blogs)) {
            result = blogs.get(0);
        }
        return result;
    }

    @Override
    public List<BlogClassify> findByHql(String hql, Map<String, Object> parameters) {
        List<BlogClassify> result = null;
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
