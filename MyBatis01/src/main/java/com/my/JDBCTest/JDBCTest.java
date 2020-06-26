package com.my.JDBCTest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
    //原始的JDBC的练习
    @Test
    public void JDBCTest01() throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection con = DriverManager.getConnection("jdbc:mysql:///test", "root", "123");
        PreparedStatement pre = con.prepareStatement("select username from user where id = 1");

        //获取结果集
        ResultSet resultSet = pre.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
        resultSet.close();
        pre.close();
        con.close();
    }

    //原生JDBC的插入操作的练习
    @Test
    public void JDBCTest02() throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "123");

        //预编译执行sql语句
        PreparedStatement pre = conn.prepareStatement("insert into account (name,money) value (?,?)");
        pre.setString(1,"王五");
        pre.setDouble(2,200.2);
        int i = pre.executeUpdate();
        System.out.println(i);
        pre.close();
        conn.close();
    }

    //原生JDBC的删除操作
    @Test
    public void Test03 () throws Exception{
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "123");

        //编写操作语句
        PreparedStatement pre = conn.prepareStatement("update account set money = ? where id=?");
        pre.setDouble(1, 400);
        pre.setInt(2,6);

        int i = pre.executeUpdate();
        System.out.println(i);

        //关闭资源
        pre.close();
        conn.close();
    }

    //原生JDBC的删除操作
    @Test
    public void Test04() throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql:///ssm", "root", "123");

        //预编译sql语句
        PreparedStatement pre = conn.prepareStatement("delete from account where id = 6");

        //执行sql语句
        int execute = pre.executeUpdate();
        System.out.println(execute);

        //关闭资源
        pre.close();
        conn.close();
    }
}
