package tech.nospring;

import lombok.val;
import tech.nospring.service.DataService;
import tech.nospring.service.impl.DataServiceImpl;

public class App {

    public static void main(String[] args) {
        DataService dataService = new DataServiceImpl();// 自己创建对象
        dataService.getData();
    }
}
