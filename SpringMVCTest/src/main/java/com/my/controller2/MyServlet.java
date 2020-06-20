package com.my.controller2;

import com.my.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取applicatonContext对象
        ServletContext servletContext = this.getServletContext();
        //获取spring容器
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        IUserService us = app.getBean(IUserService.class);
        us.getData();
    }
}
