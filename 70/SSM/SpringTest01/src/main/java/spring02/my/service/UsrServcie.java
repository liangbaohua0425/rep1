package spring02.my.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import spring02.my.dao.IUserDao;

@Service
public class UsrServcie implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Value("${jdbc.userName}")
    private String driver;

    public void getUserName() {
        System.out.println("我是服务层");
        System.out.println(driver);
        userDao.getUserName();
    }
}
