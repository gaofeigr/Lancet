package com.lancet.base.service.impl;

import com.lancet.base.dao.BaseDao;
import com.lancet.base.service.BaseService;
import com.lancet.util.SpringBeanUtil;
import com.lancet.util.StringUtil;
import org.springframework.stereotype.Service;

/**
 * @Description 服务层基类，所有service都要继承此service
 * @Date 2019-3-8 00:31
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class BaseServiceImpl implements BaseService {

    @Override
    public String getClassName() {
        String className = this.getClass().getName();
        //判断是否为代理类
        if (StringUtil.isContainsStr(className, "$")) {
            className = StringUtil.findStr(className, "com.lancet.[a-z]*.service.impl.[A-Za-z]*");
        }
        return className;
    }

    @Override
    public String getEntityName() {
        String entityName = getClassName();
        entityName = entityName.replace("service.impl", "entity");
        entityName = entityName.replace("ServiceImpl", "");
        return entityName;
    }

    @Override
    public String getBeanName() {
        String beanName = getClassName();
        beanName = StringUtil.findStr(beanName, "[A-Za-z]*Impl");
        beanName = beanName.replace("ServiceImpl", "DaoImpl");
        beanName = beanName.replaceFirst(beanName.substring(0, 1), beanName.substring(0, 1).toLowerCase());
        return beanName;
    }

    @Override
    public BaseDao getBaseDao() {
        return (BaseDao) SpringBeanUtil.getBean(getBeanName());
    }

    @Override
    public void add(Object entity) {
        getBaseDao().add(entity);
    }

    @Override
    public void update(Object entity) {
        getBaseDao().update(entity);
    }

    @Override
    public void delete(Object entity) {
        getBaseDao().delete(entity);
    }

    @Override
    public Object findById(Integer id) {
        return getBaseDao().findById(id);
    }
}
