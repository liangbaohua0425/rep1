package com.my.SpringTest03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring03.com.my.homework.ITarget;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:aopAnnoContext.xml"})
public class AOPTest03 {

    //注入dao和service
    @Autowired
    private ITarget target;

    @Test
    public void aopTest01() {
        target.targetMethod();
    }

    @Test
    public void aopTest02() {
        target.targetMethod2();
    }
}
