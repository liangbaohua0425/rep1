package spring03.com.my.aopTestOfXML;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
    public void before() {
        System.out.println("前值增强");
    }

    public void after() {
        System.out.println("最终增强增强");
    }

    public void afterReturn(){
        System.out.println("后置增强");
    }

    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强中的前置增强");
        pjp.proceed();
        System.out.println("环绕增强中的后置增强");
    }

    public void throwExceptionMethod(Exception exception){
        System.out.println("抛出异常" + exception.getMessage());
    }

    public void before1() {
        System.out.println("前值增强2");
    }

    public void after1() {
        System.out.println("最终增强增强2");
    }

    public void afterReturn1(int num){
        System.out.println("后置增强2");
        System.out.println(num);
    }

    public int aroundMethod1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强中的前置增强2");
        Integer a = (Integer) pjp.proceed();
        System.out.println("环绕增强中的后置增强2" + a);
        return a;
    }

    public void throwExceptionMethod1(){
        System.out.println("抛出异常2");
    }
}
