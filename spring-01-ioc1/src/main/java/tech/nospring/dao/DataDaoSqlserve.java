package tech.nospring.dao;

public class DataDaoSqlserve implements DataDao {
    @Override
    public void getData() {
        System.out.println("从Sqlsever获取数据。。。");
    }
}
