package com.gaofei.lancet.dao;

import com.gaofei.lancet.entity.LancetBlogClassify;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客分类Dao
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetBlogClassifyDao {
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

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<LancetBlogClassify> findByHql(String hql, Map<String, Object> parameters);
}
