package com.wang.testuser;

import com.wangbin.dao.IUserDao;
import com.wangbin.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试user类.
 * Created by wangbin on 2017/12/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void testSelectUserById() throws Exception {
        long id = 1;
        UserModel userModel = userDao.selectUserById(id);
        System.out.println(userModel.toString());
    }

}
