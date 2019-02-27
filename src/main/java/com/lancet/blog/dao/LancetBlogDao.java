package com.lancet.blog.dao;

import com.lancet.blog.entity.LancetBlog;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客Dao
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetBlogDao {
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

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<LancetBlog> findByHql(String hql, Map<String, Object> parameters);
}
