package tech.xiu.service;

import org.springframework.stereotype.Service;


@Service // 将该类交给Spring容器管理，创建出一个叫userServiceImpl的Bean
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("添加一个user");
    }

    @Override
    public void selectUser() {
        System.out.println("查询一个User");
    }

    @Override
    public void updateUser() {
        System.out.println("更新一个User");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除一个user");
    }
}
