package com.lancet.blog.controller;

import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
import com.lancet.person.entity.Person;
import com.lancet.person.service.PersonService;
import com.lancet.util.DateUtil;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Currency;
import java.util.Date;

/**
 * @Description 博客分类Controller
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/blogClassify/main")
public class BlogClassifyController {

    @Resource
    private BlogClassifyService blogClassifyService;

    @Resource
    private PersonService personService;

    @RequestMapping("/index")
    public String index() {
        return "/blog/classify/index";
    }

    @RequestMapping("/add")
    public String addBlog(HttpServletRequest request) {
        String createTime = DateUtil.formatDataToString(new Date(), null);
        Person createPerson = (Person) personService.findById(1);
        request.setAttribute("createTime", createTime);
        request.setAttribute("createPerson", createPerson);
        return "/blog/classify/main/blog_classify_edit";
    }

    @RequestMapping("/save")
    public String saveBlog(BlogClassify blogClassify) {
        blogClassify.setCreateTime(new Date());
//        blogClassifyService.add(blogClassify);
        return "/common/msg/success";
    }
}
