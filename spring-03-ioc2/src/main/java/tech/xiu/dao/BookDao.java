package tech.xiu.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    @Value("${name}")
    private String tableName;

    public void getData() {
        System.out.println("got data from -> "+ tableName);
    }
}
