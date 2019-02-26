package com.lancet.controller;

import com.lancet.service.LancetBlogService;
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
        return "blog/main/index";
    }
}
