package com.lancet.blog.service.impl;

import com.lancet.blog.dao.BlogDao;
import com.lancet.blog.entity.Blog;
import com.lancet.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 博客Service实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogDao blogDao;

    @Override
    public void add(Blog blog) {
        blogDao.add(blog);
    }

    @Override
    public void update(Blog blog) {
        blogDao.update(blog);
    }

    @Override
    public void delete(Blog blog) {
        blogDao.delete(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return blogDao.findById(id);
    }
}
