package com.lancet.base.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Description dao基类
 * @Date 2019-2-26 22:17
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository
public class BaseDaoImpl extends HibernateDaoSupport {

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
}
