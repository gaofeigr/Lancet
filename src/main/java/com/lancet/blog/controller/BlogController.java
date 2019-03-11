package com.lancet.blog.controller;

import com.lancet.base.controller.BaseController;
import com.lancet.blog.entity.Blog;
import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
import com.lancet.blog.service.BlogService;
import com.lancet.person.entity.Person;
import com.lancet.person.service.PersonService;
import com.lancet.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Description 博客Controller
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/blog/main")
public class BlogController extends BaseController {

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
    public String addBlog(HttpServletRequest request) {
        String createTime = DateUtil.formatDataToString(new Date(), null);
        Person createPerson = (Person) personService.findById(1);
        List<BlogClassify> allClassify = blogClassifyService.findAllClassify();

        request.setAttribute("allClassify", allClassify);
        request.setAttribute("createTime", createTime);
        request.setAttribute("createPerson", createPerson);

        return "/blog/main/blog_main_edit";
    }

    @RequestMapping("/save")
    public String saveBlog(Blog blog) {
        blogService.add(blog);
        return "/common/msg/success";
    }
}
