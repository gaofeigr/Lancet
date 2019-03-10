package com.lancet.blog.service.impl;

import com.lancet.base.service.BaseService;
import com.lancet.base.service.impl.BaseServiceImpl;
import com.lancet.blog.dao.BlogClassifyDao;
import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 博客分类Service实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Service("blogClassifyService")
public class BlogClassifyServiceImpl extends BaseServiceImpl implements BlogClassifyService {

    @Autowired
    private BlogClassifyDao blogClassifyDao;

    @Override
    public List<BlogClassify> findAllClassify() {
        return blogClassifyDao.findListByHql("from BlogClassify");
    }
}
