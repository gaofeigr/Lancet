package com.lancet.blog.dao.impl;

import com.lancet.base.dao.impl.BaseDaoImpl;
import com.lancet.blog.dao.BlogDao;
import com.lancet.blog.entity.Blog;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 博客Dao实现类
 * @Date 2019-2-20 20:59
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository("blogDao")
public class BlogDaoImpl extends BaseDaoImpl implements BlogDao {
}
