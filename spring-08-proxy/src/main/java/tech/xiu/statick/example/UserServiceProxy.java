package tech.xiu.statick.example;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void addUser() {
        log("add");
        userService.addUser();
    }

    @Override
    public void updateUser() {
        log("update");
        userService.updateUser();
    }

    @Override
    public void deleteUser() {
        log("delete");
        userService.deleteUser();
    }

    @Override
    public void queryUser() {
        log("query");
        userService.queryUser();
    }

    private void log(String msg) {
        System.out.println("调用了"+msg+"方法！");
    }
}
