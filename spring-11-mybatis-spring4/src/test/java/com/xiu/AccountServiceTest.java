package com.xiu;

import com.xiu.config.AspectConfig;
import com.xiu.config.JdbcConfig;
import com.xiu.config.MybatisConfig;
import com.xiu.pojo.Account;
import com.xiu.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfig.class, MybatisConfig.class, AspectConfig.class})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1() {
        accountService.spendTimeTotal(100);
    }
}
