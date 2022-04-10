package tech.xiu.service.impl;

import tech.xiu.dao.DataDao;
import tech.xiu.dao.DataDaoMysql;
import tech.xiu.dao.DataDaoOracle;
import tech.xiu.service.DataService;

public class DataServiceImpl implements DataService {

    private DataDao dataDao;

    @Override
    public void setDataDao(DataDao dataDao) {
        this.dataDao = dataDao;
    }

    @Override
    public void getData() {
        dataDao.getData();
    }
}
