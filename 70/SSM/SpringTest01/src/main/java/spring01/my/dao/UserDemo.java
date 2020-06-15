package spring01.my.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {

    public static void main(String[] args) {
        //创建Spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) app.getBean("userDao");
        IUserDao userDao1 = (IUserDao) app.getBean("userDao");
        userDao.getName();
        System.out.println(userDao1.toString());
    }
}
