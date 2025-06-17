package tech.nospring.service.impl;

import tech.nospring.dao.DataDao;
import tech.nospring.dao.DataDaoMysql;
import tech.nospring.service.DataService;

public class DataServiceImpl implements DataService {

    private DataDao dataDao = new DataDaoMysql(); // 自己创建对象

    @Override
    public void getData() {
        System.out.println("service getData....");
        dataDao.getData();
    }
}
