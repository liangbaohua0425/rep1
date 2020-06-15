package spring01.my.dao;

public class UserFactory {
    public UserFactory(){

        System.out.println("创建工厂");
    }

    public IUserDao getUser(){
        return new UserDaoImpl();
    }
}
