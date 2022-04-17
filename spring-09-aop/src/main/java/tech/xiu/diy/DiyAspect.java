package tech.xiu.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import tech.xiu.service.UserServiceImpl;

public class DiyAspect {

    public void before() {
        System.out.println("方法执行前。。。");
    }

    public void after() {
        System.out.println("方法执行后。。。");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        try{
            System.out.println("环绕通知里的前置通知。。。");
            proceedingJoinPoint.proceed();
            System.out.println("环绕通知里的后置通知。。。。");
        }catch (Throwable e) {
            System.out.println("异常通知。。。");
        }finally {
            System.out.println("最终通知。。。。。");
        }
    }
}
