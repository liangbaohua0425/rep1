package com.my.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring04.com.my.tx.service.IAccountService;

public class Test01 {

    @Test
    public void test01(){
        //启动Spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("txContext01.xml");

        //获取配置类
        IAccountService service = app.getBean("accountService", IAccountService.class);
        service.changeMoney();
    }

    @Test
    public void test02(){
        //启动Spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("txContext02.xml");

        //获取配置类
        IAccountService service = app.getBean("accountService", IAccountService.class);
        service.changeMoney();
    }
}
