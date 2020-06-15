package com.my.spring01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring02.my.config.UserConfigeration;
import spring02.my.dao.IUserDao;
import spring02.my.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UserConfigeration.class})
public class Spring02Test {

    //注入dao和service
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserDao userDao;

    @Test
    public void getUserDao(){
        userDao.getUserName();
    }

    @Test
    public void getUserService(){
        userService.getUserName();
    }
}
