package com.lancet.person.service.impl;

import com.lancet.person.dao.PersonDao;
import com.lancet.person.entity.Person;
import com.lancet.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用户Service实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public void add(Person person) {
        personDao.add(person);
    }

    @Override
    public void update(Person person) {
        personDao.update(person);
    }

    @Override
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    public Person findById(Integer id) {
        return personDao.findById(id);
    }
}
