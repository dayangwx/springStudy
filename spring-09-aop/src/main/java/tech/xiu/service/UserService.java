package tech.xiu.service;

import org.springframework.stereotype.Service;
//@Service // 接口不可以被实例化，只能实例化它的子类。所以接口上不能加@Service注解 @Service会去实列化Bean，也就是创建对象。
public interface UserService {

    void addUser();
    void selectUser();
    void updateUser();
    void deleteUser();
}
