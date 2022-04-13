package tech.xiu.example;

public class UserController {


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.addUser();
        System.out.println("=============");
        userServiceProxy.updateUser();
        System.out.println("==============");
        userServiceProxy.queryUser();
    }
}
