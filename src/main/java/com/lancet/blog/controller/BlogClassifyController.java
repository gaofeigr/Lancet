package com.lancet.blog.controller;

import com.alibaba.fastjson.JSON;
import com.lancet.base.controller.BaseController;
import com.lancet.base.dao.Page;
import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
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

/**
 * @Description 博客分类Controller
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/blogClassify/main")
public class BlogClassifyController extends BaseController {

    @Resource
    private BlogClassifyService blogClassifyService;

    @Resource
    private PersonService personService;

    @RequestMapping("/list")
    @ResponseBody
    public String list(Page page,
                       @RequestParam(name = "classifyName", required = false) String classifyName,
                       @RequestParam(name = "createPerson", required = false) String createPerson,
                       @RequestParam(name = "parentId", required = false) String parentId) {
        String hql = "from " + blogClassifyService.getEntityName() + " as b where 1=1";
        if (StringUtil.isNotNull(classifyName)) {
            hql += " and b.classifyName like :classifyName";
            classifyName = "%" + classifyName + "%";
        }
        if (StringUtil.isNotNull(createPerson)) {
            hql += " and b.createPerson.name like :createPersonName";
            classifyName = "%" + createPerson + "%";
        }
        if (StringUtil.isNotNull(parentId)) {
            hql += " and b.parentClassify.id = :parentId";
        }
        return JSON.toJSONString(blogClassifyService.findByPage(page, hql, classifyName, createPerson, parentId));
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
        blogClassify.setCreatePerson((Person) personService.findById(1));
        blogClassifyService.add(blogClassify);
        return "/common/msg/success";
    }
}
