package com.wangbin.service;

import com.wangbin.model.UserModel;

/**
 * 用户sevice接口.
 * Created by wangbin on 2017/12/31.
 */
public interface IUserService {

    UserModel selectUserById(long id);
}
