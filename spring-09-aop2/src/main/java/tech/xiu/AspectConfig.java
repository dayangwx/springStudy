package tech.xiu;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration   // 说明它是个配置类，相当于beans.xml
@Aspect          // 说明这是个切面
@ComponentScan("tech.xiu")  // 扫描该路径下的类的注解
@EnableAspectJAutoProxy     // 开启AOP
public class AspectConfig {

    @Pointcut(value = "execution(* tech.xiu.UserServiceImpl.*(..))")
    public void pointcut1(){}

    @Before("pointcut1()")
    public void before() {
        System.out.println("前置通知。。。。");
    }

    @After("pointcut1()")
    public void after() {
        System.out.println("后置通知。。。。");
    }

    @AfterThrowing("pointcut1()")
    public void throwsErr() {
        System.out.println("异常通知。。。。");
    }

    @Around("pointcut1()")
    public void around(ProceedingJoinPoint pjp) {

        try{
            System.out.println("环绕通知前。。。");
            pjp.proceed();
            System.out.println("环绕通知后。。。");
        }catch (Throwable t) {
            System.out.println("异常通知。。。（环绕通知里）");
        }finally {
            System.out.println("最终通知。。。（环绕通知里）");
        }
    }

    @AfterReturning(value="pointcut1()",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " ends with " + result);
    }

}
