package com.my.controller2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {


        //将Spring容器加载到applicationContext中
        ServletContext sc = servletContextEvent.getServletContext();
        String myParam = sc.getInitParameter("myParam");
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(myParam);
        sc.setAttribute("app",app);
        System.out.println("this is myListener");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
