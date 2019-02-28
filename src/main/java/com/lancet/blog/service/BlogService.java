package com.lancet.blog.service;

import com.lancet.blog.entity.Blog;

/**
 * @Description 博客Service
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BlogService {
    /**
     * 新增
     * @param blog
     * @return
     */
    void add(Blog blog);

    /**
     * 更新
     * @param blog
     * @return
     */
    void update(Blog blog);

    /**
     * 删除
     * @param blog
     * @return
     */
    void delete(Blog blog);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    Blog findById(String id);
}
