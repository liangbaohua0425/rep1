package com.my.controller;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class applicationUtils {
    //在ServletContext中获取Srping容器
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");
        return app;
    }
}
