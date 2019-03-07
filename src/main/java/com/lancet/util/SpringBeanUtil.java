package com.lancet.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description 常用springBean操作工具类
 * @Date 2019-3-8 00:38
 * @Author GaoFei
 * @Version 1.0
 **/
@Component
public class SpringBeanUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    public static Object getBean(String entityName) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(entityName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtil.applicationContext = applicationContext;
    }
}
