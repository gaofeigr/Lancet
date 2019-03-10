package com.lancet.base.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description controller基类，所有controller都需要继承此controller
 * @Date 2019-3-10 17:33
 * @Author GaoFei
 * @Version 1.0
 **/
@Controller
public class BaseController {
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest webRequest) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
