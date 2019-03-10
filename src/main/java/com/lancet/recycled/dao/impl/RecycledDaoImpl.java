package com.lancet.recycled.dao.impl;

import com.lancet.base.dao.impl.BaseDaoImpl;
import com.lancet.recycled.dao.RecycledDao;
import com.lancet.recycled.entity.Recycled;
import com.lancet.util.ListUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description 回收站Dao实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Repository("recycledDao")
public class RecycledDaoImpl extends BaseDaoImpl implements RecycledDao {
}
