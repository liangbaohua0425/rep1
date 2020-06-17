package spring03.com.my.homework;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {

    //切点表达式的抽取
    @Pointcut("execution(* spring03..homework.TargetImpl.targetMethod(..))")
    public void expression() {
    }

    @Around("Advice.expression()")
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强中的前置增强");
        long startTime = System.currentTimeMillis();

        //签名类
        Signature signature = pjp.getSignature();
        //获取方法名
        String name = signature.getName();

        //获取接口名
        String declaringTypeName = signature.getDeclaringTypeName();

        //执行原本的方法
        pjp.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("方法名：" + name);
        System.out.println("接口名：" + declaringTypeName);
        System.out.println("时长：" + (endTime - startTime));
    }
}
