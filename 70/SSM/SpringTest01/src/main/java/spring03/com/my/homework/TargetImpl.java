package spring03.com.my.homework;

import org.springframework.stereotype.Component;

@Component("target")
public class TargetImpl implements ITarget {
    public void targetMethod() {
        System.out.println("目标类的原始方法");
    }

    public int targetMethod2(){
        System.out.println("有返回值的aop增强方法2");
        return 2;
    }
}
