package com.lancet.base.controller;


import com.lancet.blog.entity.BlogClassify;
import com.lancet.blog.service.BlogClassifyService;
import com.lancet.util.ListUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description 首页的controller
 * @Date 2019-3-11 21:52
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {

    @Resource
    BlogClassifyService blogClassifyService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        //查询所有分类
        List<BlogClassify> classifies = blogClassifyService.findByHql(null);
        for (BlogClassify item : classifies) {
            setChildClassifys(item);
        }
        request.setAttribute("classifies", classifies);
        return "index";
    }

    private void setChildClassifys(BlogClassify blogClassify) {
        String hql = "from " + blogClassifyService.getEntityName() + " where parentClassify.id = :id";
        List<BlogClassify> blogClassifies = blogClassifyService.findByHql(hql, blogClassify.getId());
        if (ListUtil.isNotEmpty(blogClassifies)) {
            blogClassify.setChildClassifys(blogClassifies);
            for (BlogClassify item : blogClassifies) {
                setChildClassifys(item);
            }
        }
    }
}
