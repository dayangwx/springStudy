package tech.xiu.example;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("添加一个User");
    }

    @Override
    public void updateUser() {
        System.out.println("更新一个User");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除一个User");
    }

    @Override
    public void queryUser() {
        System.out.println("查询一个User");
    }
}
