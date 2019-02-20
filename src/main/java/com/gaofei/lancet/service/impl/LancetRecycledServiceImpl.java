package com.gaofei.lancet.service.impl;

import com.gaofei.lancet.dao.LancetRecycledDao;
import com.gaofei.lancet.entity.LancetRecycled;
import com.gaofei.lancet.service.LancetRecycledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 回收站Service实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class LancetRecycledServiceImpl implements LancetRecycledService {

    @Autowired
    LancetRecycledDao lancetRecycledDao;

    @Override
    public void add(LancetRecycled lancetRecycled) {
        lancetRecycledDao.add(lancetRecycled);
    }

    @Override
    public void update(LancetRecycled lancetRecycled) {
        lancetRecycledDao.update(lancetRecycled);
    }

    @Override
    public void delete(LancetRecycled lancetRecycled) {
        lancetRecycledDao.delete(lancetRecycled);
    }

    @Override
    public LancetRecycled findById(String id) {
        return lancetRecycledDao.findById(id);
    }
}
