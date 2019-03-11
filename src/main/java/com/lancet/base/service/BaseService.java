package com.lancet.base.service;

import com.lancet.base.dao.BaseDao;
import com.lancet.base.dao.Page;
import com.lancet.blog.entity.BlogClassify;

import java.util.List;

/**
 * @Description 服务层基类，所有service都要继承此service
 * @Date 2019-3-8 00:31
 * @Author GaoFei
 * @Version 1.0
 **/
public interface BaseService {

    /**
     * 获取class全名
     * @return
     */
    String getClassName();

    /**
     * 获取实体bean class全名
     * @return
     */
    String getEntityName();

    /**
     * 获取DaoBeanName
     * @return
     */
    String getDaoBeanName();

    /**
     * 获取BaseDao
     * @return
     */
    BaseDao getBaseDao();

    /**
     * 新增
     * @param entity
     * @return
     */
    void add(Object entity);

    /**
     * 更新
     * @param entity
     * @return
     */
    void update(Object entity);

    /**
     * 删除
     * @param entity
     * @return
     */
    void delete(Object entity);

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    Object findById(Integer id);

    /**
     * 分页查询
     * @return
     */
    Page findByPage();

    /**
     * 分页查询
     * @return
     */
    Page findByPage(Page page, String hql, Object...parameters);

    /**
     * hql查询
     * @return
     */
    List findByHql(String hql, Object...parameters);
}
