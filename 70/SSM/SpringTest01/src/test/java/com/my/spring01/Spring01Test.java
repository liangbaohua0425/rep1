package com.my.spring01;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring02.my.service.IUserService;

import java.sql.Connection;
import java.sql.SQLException;

public class Spring01Test {

//c3p0的数据库连接池练习
    @Test
    public void c3p0Test() throws Exception {
        //创建数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        //设置数据库连接驱动
        dataSource.setDriverClass("com.mysql.jdbc.Driver");

        //设置连接的数据库
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        //填写账号密码
        dataSource.setUser("root");
        dataSource.setPassword("123");

        //获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection.getClass());
    }

    //druid的数据库连接池的练习
    @Test
    public void druidTest() throws SQLException {
        //创建连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        //设置数据库驱动
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        //设置数据库相关信息
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection.getClass());
    }

    @Test
    public void test3(){
        //创建Spring容器
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("annoContext.xml");

        //获取实体类对象
        IUserService userService = app.getBean(IUserService.class);
        userService.getUserName();
        System.out.println(userService);
    }
}
