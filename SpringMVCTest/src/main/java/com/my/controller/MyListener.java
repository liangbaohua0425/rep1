package com.my.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        //获取ServletContext
        ServletContext servletContext = servletContextEvent.getServletContext();
        //读取web.xml中的全局参数
        String configLocation = servletContext.getInitParameter("configLocation");
        //加载Spring配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(configLocation);

        System.out.println("Listener Builder");
        //加载Spring容器到servletContext中
        servletContext.setAttribute("app", app);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
