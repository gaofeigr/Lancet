package com.lancet.blog.service.impl;

import com.lancet.blog.dao.LancetBlogClassifyDao;
import com.lancet.blog.entity.LancetBlogClassify;
import com.lancet.blog.service.LancetBlogClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 博客分类Service实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class LancetBlogClassifyServiceImpl implements LancetBlogClassifyService {

    @Autowired
    private LancetBlogClassifyDao lancetBlogClassifyDao;

    @Override
    public void add(LancetBlogClassify lancetBlogClassify) {
        lancetBlogClassifyDao.add(lancetBlogClassify);
    }

    @Override
    public void update(LancetBlogClassify lancetBlogClassify) {
        lancetBlogClassifyDao.update(lancetBlogClassify);
    }

    @Override
    public void delete(LancetBlogClassify lancetBlogClassify) {
        lancetBlogClassifyDao.delete(lancetBlogClassify);
    }

    @Override
    public LancetBlogClassify findById(String id) {
        return lancetBlogClassifyDao.findById(id);
    }
}
