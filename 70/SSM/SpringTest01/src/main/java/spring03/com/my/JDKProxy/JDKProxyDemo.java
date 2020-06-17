package spring03.com.my.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyDemo {
    public static void main(String[] args) {
        //创建目标对象
        final ITarget target = new TargetImpl();

        //创建增强对象
        final AdviceClass advice = new AdviceClass();

        //创建JDK的动态代理对象
        ITarget o = (ITarget) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//获取类加载器
                target.getClass().getInterfaces(),//获取接口的字节码数组
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        Object invoke = method.invoke(target,args);
                        advice.post();
                        return invoke;
                    }
                }
        );
        o.tartgetMethod();
    }
}
