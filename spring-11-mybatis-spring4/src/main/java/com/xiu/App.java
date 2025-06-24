package com.xiu;

import com.xiu.config.JdbcConfig;
import com.xiu.config.MybatisConfig;
import com.xiu.mapper.AccountDao;
import com.xiu.pojo.Account;
import com.xiu.service.AccountService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        sqlSessionWay();
//        sqlSessionTemplateToGetData();
    }

    private static void sqlSessionTemplateToGetData() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class, MybatisConfig.class);
        SqlSessionTemplate sSqlSessionTemplate = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        AccountDao accountDao = sSqlSessionTemplate.getMapper(AccountDao.class);
        System.out.println(accountDao.findById(5));
    }


    private static void sqlSessionWay() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class, MybatisConfig.class);
        AccountService accountServiceImpl = context.getBean("accountServiceImpl", AccountService.class);
        Account account = accountServiceImpl.findById(1);
        System.out.println(account);
    }
}
