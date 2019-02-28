package com.lancet.blog.dao;

import com.lancet.blog.entity.BlogClassify;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客分类Dao
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BlogClassifyDao {
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
    BlogClassify findById(String id);

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<BlogClassify> findByHql(String hql, Map<String, Object> parameters);
}
