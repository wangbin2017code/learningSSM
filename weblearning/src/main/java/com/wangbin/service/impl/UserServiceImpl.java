package com.wangbin.service.impl;

import com.wangbin.dao.IUserDao;
import com.wangbin.model.UserModel;
import com.wangbin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户service的实现类.
 * Created by wangbin on 2017/12/31.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;


    @Override
    public UserModel selectUserById(long id) {
        return userDao.selectUserById(id);
    }
}
