package com.my.jdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test01 {

    @Test
    public void test01(){
        //获取数据库连接池
        DruidDataSource dataSource = new DruidDataSource();

        //设置数据库相关
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //设置JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        int row = jdbcTemplate.update("insert into account values(?,?,?)", 3, "张飞", 200);
        System.out.println(row);
    }
}
