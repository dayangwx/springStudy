package tech.xiu.dao;

public class DataDaoMysql implements DataDao{
    @Override
    public void getData() {
        System.out.println("从mysql获取数据。。。");
    }
}
