package com.lancet.blog.service;

import com.lancet.blog.entity.LancetBlog;

/**
 * @Description 博客Service
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetBlogService {
    /**
     * 新增
     * @param lancetBlog
     * @return
     */
    void add(LancetBlog lancetBlog);

    /**
     * 更新
     * @param lancetBlog
     * @return
     */
    void update(LancetBlog lancetBlog);

    /**
     * 删除
     * @param lancetBlog
     * @return
     */
    void delete(LancetBlog lancetBlog);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    LancetBlog findById(String id);
}
