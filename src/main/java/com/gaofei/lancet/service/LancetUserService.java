package com.gaofei.lancet.service;

import com.gaofei.lancet.entity.LancetUser;

import java.util.List;

/**
 * @Description 用户Service
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetUserService {
    /**
     * 新增
     * @param lancetUser
     * @return
     */
    void add(LancetUser lancetUser);

    /**
     * 更新
     * @param lancetUser
     * @return
     */
    void update(LancetUser lancetUser);

    /**
     * 删除
     * @param lancetUser
     * @return
     */
    void delete(LancetUser lancetUser);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    LancetUser findById(String id);
}
