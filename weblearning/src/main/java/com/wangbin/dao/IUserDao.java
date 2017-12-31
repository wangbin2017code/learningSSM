package com.wangbin.dao;

import com.wangbin.model.UserModel;

/**
 * 用户dao.
 * Created by wangbin on 2017/12/31.
 */
public interface IUserDao {

    UserModel selectUserById(long id);
}
