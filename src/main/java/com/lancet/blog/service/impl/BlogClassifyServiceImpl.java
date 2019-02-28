package com.lancet.blog.service.impl;

import com.lancet.blog.dao.BlogClassifyDao;
import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 博客分类Service实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class BlogClassifyServiceImpl implements BlogClassifyService {

    @Autowired
    private BlogClassifyDao blogClassifyDao;

    @Override
    public void add(BlogClassify blogClassify) {
        blogClassifyDao.add(blogClassify);
    }

    @Override
    public void update(BlogClassify blogClassify) {
        blogClassifyDao.update(blogClassify);
    }

    @Override
    public void delete(BlogClassify blogClassify) {
        blogClassifyDao.delete(blogClassify);
    }

    @Override
    public BlogClassify findById(Integer id) {
        return blogClassifyDao.findById(id);
    }
}
