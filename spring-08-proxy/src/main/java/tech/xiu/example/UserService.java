package tech.xiu.example;

/**
 * 抽象出来的接口
 * 真实对象与代理都会实现这个接口
 *
 */
public interface UserService {

    void addUser();
    void updateUser();
    void deleteUser();
    void queryUser();
}
