package com.my.jdbcTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring04.com.my.pojo.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbcTemplate.xml")
public class Test3 {
    @Autowired
    private JdbcTemplate template;

    @Test
    public void test01() {
        int row = template.update("insert into account values(?,?,?)", 5, "关羽", 200);
        System.out.println(row);
    }

    @Test
    public void test02() {
        Account account = template.queryForObject("select * from account where id = ?",
                new BeanPropertyRowMapper<Account>(Account.class), 2);
        System.out.println(account.toString());
    }


}
