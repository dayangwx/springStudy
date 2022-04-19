package tech.xiu.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@Aspect
@EnableAspectJAutoProxy
public class AspectConfig {

    @Pointcut(value = "execution(* tech.xiu.service.impl.EmpServiceImpl.*(..))")
    public void pointcut1(){}

    @Before("pointcut1()")
    public void before() {
        System.out.println("执行前");
    }
}
