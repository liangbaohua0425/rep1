package spring04.com.my.tx.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public void sendMoney() throws Exception {
        try{
            accountDao.getMoney();
            int a = 1 / 0;
            accountDao.outputMoney();
            accountDao.addAccountLog("张三、李四", "转账", "Yes");
        }catch (Exception e){
            accountDao.addAccountLog("张三、李四", "转账", "No");
            e.printStackTrace();
            throw e;
        }
    }
}
