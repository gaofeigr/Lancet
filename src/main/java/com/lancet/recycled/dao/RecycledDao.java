package com.lancet.recycled.dao;

import com.lancet.recycled.entity.Recycled;

import java.util.List;
import java.util.Map;

/**
 * @Description 回收站Dao
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface RecycledDao {
    /**
     * 新增
     * @param recycled
     * @return
     */
    void add(Recycled recycled);

    /**
     * 更新
     * @param recycled
     * @return
     */
    void update(Recycled recycled);

    /**
     * 删除
     * @param recycled
     * @return
     */
    void delete(Recycled recycled);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    Recycled findById(String id);

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<Recycled> findByHql(String hql, Map<String, Object> parameters);
}
