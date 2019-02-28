package com.lancet.blog.service;

import com.lancet.blog.entity.BlogClassify;

/**
 * @Description 博客分类Service
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BlogClassifyService {
    /**
     * 新增
     * @param blogClassify
     * @return
     */
    void add(BlogClassify blogClassify);

    /**
     * 更新
     * @param blogClassify
     * @return
     */
    void update(BlogClassify blogClassify);

    /**
     * 删除
     * @param blogClassify
     * @return
     */
    void delete(BlogClassify blogClassify);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    BlogClassify findById(Integer id);
}
