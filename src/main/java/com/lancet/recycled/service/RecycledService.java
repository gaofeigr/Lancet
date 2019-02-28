package com.lancet.recycled.service;

import com.lancet.recycled.entity.Recycled;

/**
 * @Description 回收站Service
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface RecycledService {
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
}
