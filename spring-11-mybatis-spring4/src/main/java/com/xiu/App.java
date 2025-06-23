package com.xiu;

import com.xiu.config.JdbcConfig;
import com.xiu.config.MybatisConfig;
import com.xiu.pojo.Account;
import com.xiu.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class, MybatisConfig.class);
        AccountService accountServiceImpl = context.getBean("accountServiceImpl", AccountService.class);
        Account account = accountServiceImpl.findById(1);
        System.out.println(account);
    }
}
