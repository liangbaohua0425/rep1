package com.my;


import com.github.pagehelper.PageHelper;
import com.my.mapper.AccountMapper;
import com.my.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl{
    @Test
    public void test01() throws Exception{
        InputStream inS = Resources.getResourceAsStream("sqlApplication.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inS).openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        PageHelper.startPage(1,5);
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        sqlSession.close();
        inS.close();
    }

    //if动态sql语句的练习
    @Test
    public void test02() throws Exception{
        InputStream inS = Resources.getResourceAsStream("sqlApplication.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inS).openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        Account account = new Account();
        account.setId(1);
        account.setName("张三");
        account.setMoney(1100.00);

        List<Account> all = mapper.findAccount(account);
        for (Account res : all) {
            System.out.println(res);
        }
        sqlSession.close();
        inS.close();
    }

    //foreach循环参数的练习
    @Test
    public void test03() throws Exception{
        //获取读取配置文件的流对象
        InputStream stream = Resources.getResourceAsStream("sqlApplication.xml");

        //获取会话对象
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account();
        account.setName("黄盖");
        account.setMoney(1200.0);

        Account account1 = new Account();
        account1.setMoney(1300.0);
        account1.setName("赵云");

        List<Account> accounts = new ArrayList<Account>();
        accounts.add(account);
        accounts.add(account1);

        mapper.insertAll(accounts);

        sqlSession.commit();
        sqlSession.close();
        stream.close();
    }

    //foreach循环参数的练习
    @Test
    public void test04() throws Exception{
        //获取读取配置文件的流对象
        InputStream stream = Resources.getResourceAsStream("sqlApplication.xml");

        //获取会话对象
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> res = mapper.findByNameAndMoney("黄盖", null);
        for (Account re : res) {
            System.out.println(re);
        }
        sqlSession.close();
        stream.close();
    }

    //数据一对一查询
    @Test
    public void test05() throws Exception{
        //获取读取配置文件的流对象
        InputStream stream = Resources.getResourceAsStream("sqlApplication.xml");

        //获取会话对象
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> res = mapper.findOneByOne();
        for (Account re : res) {
            System.out.println(re);
        }
        sqlSession.close();
        stream.close();
    }
}
