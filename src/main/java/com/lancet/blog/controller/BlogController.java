package com.lancet.blog.controller;

import com.alibaba.fastjson.JSON;
import com.lancet.base.controller.BaseController;
import com.lancet.base.dao.Page;
import com.lancet.blog.entity.Blog;
import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
import com.lancet.blog.service.BlogService;
import com.lancet.person.entity.Person;
import com.lancet.person.service.PersonService;
import com.lancet.util.DateUtil;
import com.lancet.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/blogList")
    public String blogList(HttpServletRequest request) {
        request.setAttribute("classify", request.getAttribute("classify"));
        return "/blog/main/blog_main_list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(Page page,
                       @RequestParam(name = "classify", required = false) String classify) {
        String hql = "from " + blogService.getEntityName() + " where 1=1";
        if (StringUtil.isNotNull(classify)) {
            hql = " and classify.id = :id";
        }
        return JSON.toJSONString(blogService.findByPage(page, hql, classify));
    }
}
