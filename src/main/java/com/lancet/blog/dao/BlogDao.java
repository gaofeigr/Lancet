package com.lancet.blog.dao;

import com.lancet.blog.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客Dao
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BlogDao {
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

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<Blog> findByHql(String hql, Map<String, Object> parameters);
}
