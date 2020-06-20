package com.my.controller;

import com.my.service.IUserService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("springWebContext.xml");
        //ApplicationContext app = applicationUtils.getWebApplicationContext(this.getServletContext());
        WebApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        IUserService us = app.getBean(IUserService.class);
        us.getData();
    }
}
