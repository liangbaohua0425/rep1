package spring04.com.my.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements IAccountDao {

    //注入JdbcTemplate
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //入账的方法
    public void incomeMethod() {
        jdbcTemplate.update("update account set money = money + 100 where id = 1");
    }

    //出账的方法
    public void chuzhangMethod() {
        jdbcTemplate.update("update account set money = money - 100 where id = 2");
    }
}
