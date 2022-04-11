package tech.xiu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.xiu.pojo.User;

public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext("tech.xiu.config");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());


    }
}
