package spring03.com.my.JDKProxy;

public class AdviceClass{

    public void before(){
        System.out.println("前值增强的方法");
    }

    public void post() {
        System.out.println("后置增强的方法");
    }
}
