package com.xiu.service.impl;

import com.xiu.mapper.AccountDao;
import com.xiu.pojo.Account;
import com.xiu.service.AccountService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    // 使用 SqlSessionTemplate
//    @Autowired
//    private SqlSessionTemplate sqlSessionTemplate;


    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public Account findById(Integer id) {
//        accountDao = sqlSessionTemplate.getMapper(AccountDao.class);
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Integer spendTimeTotal(int num) {
        List<Account> results = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Account account = accountDao.findById(i + 1);
            results.add(account);
        }
        System.out.println("查询结果数量: " + results.size());
        return results.size();
    }
}
