package tech.xiu.dynamic.user;

public class UserController {


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.updateUser();
    }
}
