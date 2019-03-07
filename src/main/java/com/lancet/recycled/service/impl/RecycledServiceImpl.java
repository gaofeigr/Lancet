package com.lancet.recycled.service.impl;

import com.lancet.base.service.impl.BaseServiceImpl;
import com.lancet.recycled.dao.RecycledDao;
import com.lancet.recycled.entity.Recycled;
import com.lancet.recycled.service.RecycledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 回收站Service实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class RecycledServiceImpl extends BaseServiceImpl implements RecycledService {

    @Autowired
    RecycledDao recycledDao;
}
