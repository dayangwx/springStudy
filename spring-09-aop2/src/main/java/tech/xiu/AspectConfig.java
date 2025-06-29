package tech.xiu;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration   // 说明它是个配置类，相当于beans.xml
@Aspect          // 说明这是个切面
@ComponentScan("tech.xiu")  // 扫描该路径下的类的注解
@EnableAspectJAutoProxy     // 开启AOP
@Order(1)
public class AspectConfig {

    @Pointcut(value = "execution(* tech.xiu.UserServiceImpl.*(..))")
    public void pointcut1(){}

//    @Before("pointcut1()")
    public void before() {
        System.out.println("前置通知。。。。");
    }

//    @After("pointcut1()")
    public void after() {
        System.out.println("后置通知。。。。");
    }

//    @AfterThrowing("pointcut1()")
    public void throwsErr() {
        System.out.println("异常通知。。。。");
    }

    @Around("pointcut1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        Object obj = null;
        obj = pjp.proceed(); // 执行目标方法;
        return obj;
    }

//    @Around("pointcut1()")
//    public Object around(ProceedingJoinPoint pjp) {
//        pjp.getSignature().getName(); // 获取方法名
//        String kind = pjp.getKind();
//        System.out.println(kind); // 获取连接点类型，如method-execution
//        System.out.println(pjp.getSignature().getDeclaringType()); // 获取声明类型
//        System.out.println(pjp.getSignature().getModifiers()); // 获取修饰符
//        Object obj = null;
//        try{
//            System.out.println("环绕通知前。。。");
//            /**
//             * 不传参数 (pjp.proceed()):
//             * 使用原始的参数执行目标方法。
//             * 如果你没有对参数进行修改，调用 proceed() 会直接使用拦截到的原始方法参数。
//             */
////            obj = pjp.proceed();
//            /**
//             * 传参数 (pjp.proceed(pjp.getArgs())):
//             * 使用拦截到的原始方法参数执行目标方法。
//             * 如果你对参数进行了修改，可以使用 pjp.getArgs() 获取原始参数并传递给 proceed()。
//             */
//            Object[] args = pjp.getArgs();
//            args[0] = (int)args[0] * 3; // 修改第一个参数
//            obj = pjp.proceed(args);
//            System.out.println("环绕通知后。。。");
//        }catch (Throwable t) {
//            System.out.println("异常通知。。。（环绕通知里）");
//        }finally {
//            System.out.println("最终通知。。。（环绕通知里）");
//        }
//        return obj;
//    }

//    @AfterReturning(value="pointcut1()",
//            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        if (result != null ) {
            Integer integer = (Integer) result;
            System.out.println("The method " + methodName + " ends with " + integer );

        }else {
            System.out.println("The method " + methodName + " ends with " + null );
        }



    }

}
