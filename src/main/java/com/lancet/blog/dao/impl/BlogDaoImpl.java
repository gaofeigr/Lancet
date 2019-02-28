package com.lancet.blog.dao.impl;

import com.lancet.base.dao.impl.BaseDaoImpl;
import com.lancet.blog.dao.BlogDao;
import com.lancet.blog.entity.Blog;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
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
public class BlogDaoImpl extends BaseDaoImpl implements BlogDao {
    @Override
    public void add(Blog blog) {
        Session session = this.getSessionFactory().openSession();
        session.save(blog);
        session.close();
    }

    @Override
    public void update(Blog blog) {
        Session session = this.getSessionFactory().openSession();
        session.update(blog);
        session.close();
    }

    @Override
    public void delete(Blog blog) {
        Session session = this.getSessionFactory().openSession();
        session.delete(blog);
        session.close();
    }

    @Override
    public Blog findById(Integer id) {
        Blog result = null;
        String hql = "from Blog where id = :id";
        Session session = this.getSessionFactory().openSession();
        List<Blog> blogs = session.createQuery(hql).setParameter("id", id).list();
        session.close();
        if (ListUtil.isNotEmpty(blogs)) {
            result = blogs.get(0);
        }
        return result;
    }

    @Override
    public List<Blog> findByHql(String hql, Map<String, Object> parameters) {
        List<Blog> result = null;
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
