package tech.nospring.dao;

public class DataDaoMysql implements DataDao {
    @Override
    public void getData() {
        System.out.println("dao 从mysql获取数据。。。");
    }
}
