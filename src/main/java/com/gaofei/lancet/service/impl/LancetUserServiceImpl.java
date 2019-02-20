package com.gaofei.lancet.service.impl;

import com.gaofei.lancet.dao.LancetUserDao;
import com.gaofei.lancet.entity.LancetUser;
import com.gaofei.lancet.service.LancetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 用户Service实现类
 * @Date 2019-2-20 21:00
 * @Author GaoFei
 * @Version 1.0
 **/
@Service
public class LancetUserServiceImpl implements LancetUserService {

    @Autowired
    LancetUserDao lancetUserDao;

    @Override
    public void add(LancetUser lancetUser) {
        lancetUserDao.add(lancetUser);
    }

    @Override
    public void update(LancetUser lancetUser) {
        lancetUserDao.update(lancetUser);
    }

    @Override
    public void delete(LancetUser lancetUser) {
        lancetUserDao.delete(lancetUser);
    }

    @Override
    public LancetUser findById(String id) {
        return lancetUserDao.findById(id);
    }
}
