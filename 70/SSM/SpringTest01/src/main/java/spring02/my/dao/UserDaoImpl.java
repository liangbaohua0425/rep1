package spring02.my.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
@Component
@Controller
public class UserDaoImpl implements IUserDao {
    public void getUserName() {
        System.out.println("我是存储层");
    }
}
