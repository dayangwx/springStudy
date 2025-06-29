package tech.xiu;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
//        int i =  1/0;
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

    @Override
    public String isSucceed() {
        return "是的，成功了！！！";
    }

    @Override
    public Integer getCount(int count) {
        count = count * 100;
        System.out.println("获取count的值：" + count );
        return count;
    }
}
