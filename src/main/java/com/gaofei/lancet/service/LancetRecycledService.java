package com.gaofei.lancet.service;

import com.gaofei.lancet.entity.LancetRecycled;

import java.util.List;

/**
 * @Description 回收站Service
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetRecycledService {
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
}
