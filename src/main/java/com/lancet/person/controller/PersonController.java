package com.lancet.person.controller;

import com.lancet.base.controller.BaseController;
import com.lancet.person.entity.Person;
import com.lancet.person.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description 用户Controller
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/person/main")
public class PersonController extends BaseController {

    @Resource
    public PersonService personService;

    @RequestMapping("/index")
    public String index() {
        return "person/index";
    }

    @RequestMapping("/add")
    public String add() {
        return "person/main/person_main_edit";
    }

    @RequestMapping("/save")
    public String save(Person person) {
        person.setCreateTime(new Date());
        personService.add(person);
        return "common/msg/success";
    }
}
