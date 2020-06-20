package com.my.controller;

import com.my.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //加载配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("springWebContext.xml");
        IUserService us = app.getBean(IUserService.class);
        us.getData();
    }
}
