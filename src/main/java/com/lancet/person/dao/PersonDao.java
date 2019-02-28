package com.lancet.person.dao;

import com.lancet.person.entity.Person;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户Dao
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface PersonDao {
    /**
     * 新增
     * @param person
     * @return
     */
    void add(Person person);

    /**
     * 更新
     * @param person
     * @return
     */
    void update(Person person);

    /**
     * 删除
     * @param person
     * @return
     */
    void delete(Person person);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    Person findById(String id);

    /**
     * 根据hql查找
     * @param hql
     * @param parameters key:key, value:参数实际值
     * @return
     */
    List<Person> findByHql(String hql, Map<String, Object> parameters);
}
