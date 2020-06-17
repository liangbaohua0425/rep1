package spring03.com.my.aopTestOfAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {

    //切点表达式的抽取
    @Pointcut("execution(* spring03..aopTestOfAnno.TargetImpl.targetMethod(..))")
    public void expression(){}

    @Before("expression()")
    public void before() {
        System.out.println("前值增强");
    }

    @After("expression()")
    public void after() {
        System.out.println("最终增强增强");
    }

    @AfterReturning("expression()")
    public void afterReturn(){
        System.out.println("后置增强");
    }

    @Around("Advice.expression()")
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强中的前置增强");
        pjp.proceed();
        System.out.println("环绕增强中的后置增强");
    }

    @AfterThrowing(value = "expression()",throwing = "exception")
    public void throwExceptionMethod(Exception exception){
        System.out.println("抛出异常" + exception.getMessage());
    }

    //切点表达式的抽取
    @Pointcut("execution(* spring03.com.my.aopTestOfAnno.TargetImpl.targetMethod2(..))")
    public void expression2(){}

    @Before("expression2()")
    public void before1() {
        System.out.println("前值增强2");
    }

    @After("expression2()")
    public void after1() {
        System.out.println("最终增强增强2");
    }

    @AfterReturning(value = "expression2()",returning = "num")
    public void afterReturn1(int num){
        System.out.println("后置增强2");
        System.out.println(num);
    }

    @Around("expression2()")
    public int aroundMethod1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强中的前置增强2");
        Integer a = (Integer) pjp.proceed();
        System.out.println("环绕增强中的后置增强2" + a);
        return a;
    }

    @AfterThrowing("expression2()")
    public void throwExceptionMethod1(){
        System.out.println("抛出异常2");
    }
}
