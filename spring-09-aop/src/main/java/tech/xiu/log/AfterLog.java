package tech.xiu.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了："+method.getClass()+"的方法:"+method.getName()+"。返回结果："+returnValue);
    }
}
