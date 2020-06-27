package com.my.mapper;

import com.my.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll();

    List<Account> findAccount(Account account);

    void insertAll(List<Account> accounts);

    //多参数的练习
    List<Account> findByNameAndMoney(@Param("name") String name, @Param("money") Double money);

    //一对一数据查询返回值数据问题
    List<Account> findOneByOne();
}
