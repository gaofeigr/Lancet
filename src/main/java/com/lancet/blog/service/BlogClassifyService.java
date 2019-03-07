package com.lancet.blog.service;

import com.lancet.base.service.BaseService;
import com.lancet.blog.entity.BlogClassify;

import java.util.List;

/**
 * @Description 博客分类Service
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BlogClassifyService extends BaseService {

    List<BlogClassify> findAllClassify();
}
