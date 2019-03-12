package com.lancet.base.dao.impl;

import com.lancet.base.dao.BaseDao;
import com.lancet.base.dao.Page;
import com.lancet.person.entity.Person;
import com.lancet.util.ArrayUtil;
import com.lancet.util.ListUtil;
import com.lancet.util.StringUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 数据层基类，所有dao都要继承此dao
 * @Date 2019-2-26 22:17
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository("baseDao")
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }

    @Override
    public String getClassName() {
        String className = this.getClass().getName();
        //判断是否为代理类
        if (StringUtil.isContainsStr(className, "$")) {
            className = StringUtil.findStr(className, "com.lancet.[a-z]*.dao.impl.[A-Za-z]*");
        }
        return className;
    }

    @Override
    public String getEntityName() {
        String entityName = getClassName();
        entityName = entityName.replace("dao.impl", "entity");
        entityName = entityName.replace("DaoImpl", "");
        return entityName;
    }

    @Override
    public void add(Object entity) {
        Session session = this.getSessionFactory().openSession();
        session.save(entity);
        session.flush();
        session.close();
    }

    @Override
    public void update(Object entity) {
        Session session = this.getSessionFactory().openSession();
        session.update(entity);
        session.flush();
        session.close();
    }

    @Override
    public void delete(Object entity) {
        Session session = this.getSessionFactory().openSession();
        session.delete(entity);
        session.flush();
        session.close();
    }

    @Override
    public void deleteById(Integer id) {
        String hql = "delete " + getEntityName() + " where id=:id" ;
        Session session = this.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.executeUpdate();
        session.close();
    }

    @Override
    public Object findById(Integer id) {
        List list = this.findListByHql("from " + getEntityName() + " where id = :id", id);
        if (ListUtil.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List findListByHql(String hql, Object...parameters) {
        List result;
        parameters = ArrayUtil.clearEmptyItem(parameters);
        Session session = this.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        if (ArrayUtil.isNotEmpty(parameters)) {
            //设置查询参数
            String[] keys = StringUtil.findAllStr(hql, ":[A-Za-z0-9]*");
            for (int i = 0; i < keys.length; i++) {
                query.setParameter(keys[i].replace(":", ""), parameters[i]);
            }
        }
        result = query.list();
        session.close();
        return result;
    }

    @Override
    public Page findPageByHql(Page page, String hql, Object... parameters) {
        parameters = ArrayUtil.clearEmptyItem(parameters);
        Session session = this.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        if (ArrayUtil.isNotEmpty(parameters)) {
            //设置查询参数
            String[] keys = StringUtil.findAllStr(hql, ":[A-Za-z0-9]*");
            for (int i = 0; i < keys.length; i++) {
                query.setParameter(keys[i].replace(":", ""), parameters[i]);
            }
        }
        page.setTotal(query.list().size());
        query.setFirstResult((page.getPageNumber() - 1) * page.getPageSize());
        query.setMaxResults(page.getPageSize());
        page.setRows(query.list());
        page.setTotalPage((page.getTotal() + page.getPageSize() - 1) / page.getPageSize());
        session.close();
        return page;
    }
}
