package spring03.com.my.CGlibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibProxyDemo {
    public static void main(String[] args) {

        //创建目标对象
        final Target target = new Target();

        //创建增强器
        Enhancer enhancer = new Enhancer();

        //设置父类
        enhancer.setSuperclass(target.getClass());

        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                System.out.println("前置增强方法");
                Object invoke = method.invoke(target, objects);
                System.out.println("后置增强方法");
                return invoke;
            }
        });

        //创建代理对象
        Target o = (Target) enhancer.create();
        o.myMethod();
    }
}
