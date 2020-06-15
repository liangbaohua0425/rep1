package spring01.my.dao;

public class StaticUserFactory {

    public StaticUserFactory(){
        System.out.println("创建工厂");
    }

    public static IUserDao getUserDao(){
        return new UserDaoImpl();
    }
}
