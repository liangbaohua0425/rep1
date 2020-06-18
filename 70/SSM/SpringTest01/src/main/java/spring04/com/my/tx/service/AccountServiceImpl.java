package spring04.com.my.tx.service;

import spring04.com.my.tx.dao.IAccountDao;

public class AccountServiceImpl implements IAccountService {

    //注入dao接口
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //汇款API
    public void changeMoney(){
        accountDao.incomeMethod();
        int a = 1/0;
        accountDao.chuzhangMethod();
    }
}
