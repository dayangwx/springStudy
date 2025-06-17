package tech.nospring.dao;

public class DataDaoOracle implements DataDao {
    @Override
    public void getData() {
        System.out.println("从oracle获取数据。。。");
    }
}
