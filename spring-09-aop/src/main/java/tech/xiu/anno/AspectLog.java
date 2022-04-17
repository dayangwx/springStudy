package tech.xiu.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect     // 表示是一个切面
@Configuration  // 表示是一个配置类
@ComponentScan("tech.xiu.anno") // 规定要扫描的包路径，配置的路径下注解会生效
@EnableAspectJAutoProxy         //开启AOP 这样才能使后面的通知切入到切入点
public class AspectLog {

    @Pointcut("execution(* tech.xiu.anno.UserServiceImpl.*(..))")
    public void pj(){}

    // 方式一：
//    @Before("execution(* tech.xiu.anno.UserServiceImpl.*(..))")
//    public void before() {
//        System.out.println("操作前的日志。。。");
//    }

    @Before("pj()")
    public void before() {
        System.out.println("这是前置通知。。。。");
    }
}
