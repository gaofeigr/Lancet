package com.lancet.blog.service.impl;

import com.lancet.base.service.impl.BaseServiceImpl;
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
@Service("blogService")
public class BlogServiceImpl extends BaseServiceImpl implements BlogService {

    @Autowired
    BlogDao blogDao;
}
