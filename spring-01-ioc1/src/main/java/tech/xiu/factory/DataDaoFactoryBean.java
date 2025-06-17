package tech.xiu.factory;

import org.springframework.beans.factory.FactoryBean;
import tech.xiu.dao.DataDao;
import tech.xiu.dao.DataDaoMysql;

public class DataDaoFactoryBean implements FactoryBean<DataDao> {
    @Override
    public DataDao getObject() throws Exception {
        return new DataDaoMysql();
    }

    @Override
    public Class<?> getObjectType() {
        return DataDaoMysql.class;
    }
}
