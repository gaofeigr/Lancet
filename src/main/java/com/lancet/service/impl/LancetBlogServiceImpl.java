package com.lancet.service.impl;

import com.lancet.dao.LancetBlogDao;
import com.lancet.entity.LancetBlog;
import com.lancet.service.LancetBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 博客Service实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class LancetBlogServiceImpl implements LancetBlogService {

    @Autowired
    LancetBlogDao lancetBlogDao;

    @Override
    public void add(LancetBlog lancetBlog) {
        lancetBlogDao.add(lancetBlog);
    }

    @Override
    public void update(LancetBlog lancetBlog) {
        lancetBlogDao.update(lancetBlog);
    }

    @Override
    public void delete(LancetBlog lancetBlog) {
        lancetBlogDao.delete(lancetBlog);
    }

    @Override
    public LancetBlog findById(String id) {
        return lancetBlogDao.findById(id);
    }
}
