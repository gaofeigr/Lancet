package com.lancet.blog.controller;

import com.lancet.blog.entity.LancetBlog;
import com.lancet.blog.service.LancetBlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Description 博客Controller
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/blog/main")
public class LancetBlogController {

    @Resource
    private LancetBlogService lancetBlogService;

    @RequestMapping("/index")
    public String index() {
        return "/blog/index";
    }

    @RequestMapping("/add")
    public String addBlog() {
        return "/blog/main/blog_main_edit";
    }

    public String saveBlog(LancetBlog lancetBlog) {


        return "/msg/success";
    }
}
