package com.lancet.user.dao;

import com.lancet.user.entity.LancetUser;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户Dao
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface LancetUserDao {
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

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<LancetUser> findByHql(String hql, Map<String, Object> parameters);
}
