package spring04.com.my.tx.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void getMoney() {
        jdbcTemplate.update("update account set money = money + 100 where id = 1");
    }

    public void outputMoney() {
        jdbcTemplate.update("update account set money = money - 100 where id = 2");
    }

    //添加转账信息
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addAccountLog(String name,String operation,String isSuccess){
        jdbcTemplate.update("insert into ACCOUNTlOG (operation,result,name) values(?,?,?)",operation,isSuccess,name);
    }
}
