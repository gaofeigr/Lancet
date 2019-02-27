package com.lancet.recycled.dao;

import com.lancet.recycled.entity.LancetRecycled;

import java.util.List;
import java.util.Map;

/**
 * @Description 回收站Dao
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetRecycledDao {
    /**
     * 新增
     * @param lancetRecycled
     * @return
     */
    void add(LancetRecycled lancetRecycled);

    /**
     * 更新
     * @param lancetRecycled
     * @return
     */
    void update(LancetRecycled lancetRecycled);

    /**
     * 删除
     * @param lancetRecycled
     * @return
     */
    void delete(LancetRecycled lancetRecycled);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    LancetRecycled findById(String id);

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<LancetRecycled> findByHql(String hql, Map<String, Object> parameters);
}
