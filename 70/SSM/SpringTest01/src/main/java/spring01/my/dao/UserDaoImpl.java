package spring01.my.dao;

public class UserDaoImpl implements IUserDao {

    public UserDaoImpl(){
        System.out.println("用户类创建了");
    }

    public void getName() {
        System.out.println("周润发");
    }

    public void init(){
        System.out.println("初始化的方法");
    }

    public void destroy(){
        System.out.println("容器销毁时调用的方法");
    }

}
