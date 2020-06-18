package com.my.jdbcTemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring04.com.my.jdbcTemplate.JdbcConfigration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfigration.class})
public class Test02 {
    @Autowired
    private JdbcTemplate template;

    @Test
    public void test01() {
        int liu = template.update("insert into account values(?,?,?)", 4, "刘备", 200);
        System.out.println(liu);
    }
}
