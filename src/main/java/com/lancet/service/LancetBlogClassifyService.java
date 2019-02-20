package com.lancet.service;

import com.lancet.entity.LancetBlogClassify;

/**
 * @Description 博客分类Service
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetBlogClassifyService {
    /**
     * 新增
     * @param lancetBlogClassify
     * @return
     */
    void add(LancetBlogClassify lancetBlogClassify);

    /**
     * 更新
     * @param lancetBlogClassify
     * @return
     */
    void update(LancetBlogClassify lancetBlogClassify);

    /**
     * 删除
     * @param lancetBlogClassify
     * @return
     */
    void delete(LancetBlogClassify lancetBlogClassify);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    LancetBlogClassify findById(String id);
}
