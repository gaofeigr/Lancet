package com.lancet.person.service.impl;

import com.lancet.base.service.impl.BaseServiceImpl;
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
public class PersonServiceImpl extends BaseServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;
}
