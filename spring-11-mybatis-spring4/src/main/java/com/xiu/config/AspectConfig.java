package com.xiu.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.Instant;

@Configuration
@Aspect
@EnableAspectJAutoProxy
public class AspectConfig {

    @Pointcut("execution(* com.xiu.service.*.*(..))")
    public void pt1() {}

    @Around("pt1()")
    public Object around(ProceedingJoinPoint pjp) {

        String methodName = pjp.getSignature().getName();
        Object result = null;
        try {
            long start = System.currentTimeMillis();
            System.out.println("startTime: " + Instant.ofEpochMilli(start)
                    .atZone(java.time.ZoneId.systemDefault())
                    .toLocalTime());
            result = pjp.proceed(); // 执行目标方法
            long end = System.currentTimeMillis();
            System.out.println("endTime: " + Instant.ofEpochMilli(end)
                    .atZone(java.time.ZoneId.systemDefault())
                    .toLocalTime());
            System.out.println("环绕通知："+methodName+"方法执行时间：" + (end - start)/1000 + "秒");
        } catch (Throwable e) {
            System.out.println("异常通知：方法执行过程中发生异常，异常信息：" + e.getMessage());
        } finally {
            System.out.println("最终通知：无论是否发生异常，都会执行的操作");
        }
        return result;

    }
}
