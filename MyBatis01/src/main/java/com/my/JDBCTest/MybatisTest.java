package com.my.JDBCTest;

import com.my.POJOS.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void mybatisTest01() throws Exception{
        //获取读取mybatis核心配置类的io流对象
        InputStream is = Resources.getResourceAsStream("mybatis.xml");

        //从建造器中获取SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //从工厂中获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //执行sql语句
        List<Account> accounts = sqlSession.selectList("account.findAll", Account.class);

        for (Account account : accounts) {
            System.out.println(account);
        }

        //关闭资源
        sqlSession.close();
        is.close();
    }

    //mybatis的删除操作的练习
    @Test
    public void test02() throws Exception{
        //获取读取mybatis核心配置文件的流对象
        InputStream inStream = Resources.getResourceAsStream("mybatis.xml");

        //获取SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inStream);

        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //调用sql语句
        int delete = sqlSession.delete("account.deleteOne", 9);
        System.out.println(delete);

        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
        inStream.close();
    }

    //mybatis的修改语句的练习
    @Test
    public void test03() throws Exception{
        //获取读取mybatis核心配置文件的流对象
        InputStream inStream = Resources.getResourceAsStream("mybatis.xml");

        //获取SqlSession对象
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inStream).openSession();

        //创建实体对象数据
        Account account = new Account();
        account.setId(4);
        account.setName("刘玄德");
        account.setMoney(100.0);

        //执行sql语句
        int update = sqlSession.update("account.updateOne", account);
        System.out.println(update);

        sqlSession.commit();

        //关闭资源
        sqlSession.close();
        inStream.close();
    }

    //mybatis的插入练习
    @Test
    public void test04() throws Exception{
        //获取地区mybatis核心配置文件的类
        InputStream inStream = Resources.getResourceAsStream("mybatis.xml");

        //获取SqlSession对象
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inStream).openSession();

        Account account = new Account();
        account.setName("张飞");
        account.setMoney(30.0);

        int insert = sqlSession.insert("account.insertOne", account);
        System.out.println(insert);

        sqlSession.commit();

        sqlSession.close();
        inStream.close();
    }

    //mybatis的插入练习
    @Test
    public void test05() throws Exception{
        //获取地区mybatis核心配置文件的类
        InputStream inStream = Resources.getResourceAsStream("mybatis.xml");

        //获取SqlSession对象
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inStream).openSession();

        Account account = new Account();
        account.setName("马超");
        account.setMoney(60.0);

        int insert = sqlSession.insert("account.insertSecond", account);
        System.out.println(insert);

        sqlSession.commit();

        sqlSession.close();
        inStream.close();
    }
}
