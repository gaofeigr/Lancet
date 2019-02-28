package com.lancet.person.service;

import com.lancet.person.entity.Person;

/**
 * @Description 用户Service
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
public interface PersonService {
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
    Person findById(Integer id);
}
