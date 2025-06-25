package tech.xiu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.xiu.anno.MyAnnoConfig;
import tech.xiu.service.UserService;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAnnoConfig.class);
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.addUser();
        System.out.println("------------------");
        userService.selectUser();
        System.out.println("------------------");
        userService.updateUser();
        System.out.println("------------------");
        userService.deleteUser();


    }
}
