package com.lancet.base.dao;

import com.lancet.person.entity.Person;

import java.util.List;

/**
 * @Description 数据层基类，所有dao都要继承此dao
 * @Date 2019-3-7 23:23
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BaseDao {

    /**
     * 获取class全名
     * @return
     */
    String getClassName();

    /**
     * 获取实体bean class全名
     * @return
     */
    String getEntityName();

    /**
     * 新增
     * @param entity
     * @return
     */
    void add(Object entity);

    /**
     * 更新
     * @param entity
     * @return
     */
    void update(Object entity);

    /**
     * 删除
     * @param entity
     * @return
     */
    void delete(Object entity);

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    void deleteById(Integer id);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    Object findById(Integer id);

    /**
     * 根据传入的hql查询结果
     * @param hql hql，参数条件只能为英文字母和数字组合
     * @param parameters 参数，可为null或不传
     * @return
     */
    List findListByHql(String hql, Object...parameters);
}
