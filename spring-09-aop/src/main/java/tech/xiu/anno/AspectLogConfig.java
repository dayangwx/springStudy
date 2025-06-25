package tech.xiu.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect     // 表示是一个切面
public class AspectLogConfig {

    @Pointcut("execution(* tech.xiu.service.UserServiceImpl.*(..))")
    public void pt(){}

    // 方式一：
//    @Before("execution(* tech.xiu.anno.UserServiceImpl.*(..))")
//    public void before() {
//        System.out.println("操作前的日志。。。");
//    }

    @Before("pt()")
    public void before() {
        System.out.println("这是前置通知。。。。");
    }

    @After("pt()")
    public void after() {
        System.out.println("这是后置通知。。。。");
    }
}
