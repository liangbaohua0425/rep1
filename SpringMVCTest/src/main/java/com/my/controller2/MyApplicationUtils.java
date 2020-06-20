package com.my.controller2;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class MyApplicationUtils {
    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");
        return app;
    }
}
