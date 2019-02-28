package com.lancet.blog.controller;

import com.lancet.blog.entity.Blog;
import com.lancet.blog.service.BlogClassifyService;
import com.lancet.blog.service.BlogService;
import com.lancet.person.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description 博客Controller
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/blog/main")
public class BlogController {

    @Resource
    private BlogService blogService;

    @Resource
    private BlogClassifyService blogClassifyService;

    @Resource
    private PersonService personService;

    @RequestMapping("/index")
    public String index() {
        return "/blog/index";
    }

    @RequestMapping("/add")
    public String addBlog() {
        return "/blog/main/blog_main_edit";
    }

    @RequestMapping("/save")
    public String saveBlog(Blog blog) {
        blog.setCreatePerson(personService.findById(1));
        blog.setCreateTime(new Date());
//        blogService.add(blog);
        return "/common/msg/success";
    }
}
