package tech.xiu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.xiu.anno.AspectLog;
import tech.xiu.service.UserService;
import tech.xiu.service.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring
@ContextConfiguration(classes={AspectLog.class})//标出配置类，如果是配置文件，使用locations参数
//@ContextConfiguration(locations = {"classpath*:/*.xml"})//标出配置类，如果是配置文件，使用locations参数
public class MyTest {

    @Autowired
    private UserService userServiceAnno;

    @Test
    public void test1() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        UserService userService = (UserService) context.getBean("userService");
//        userService.updateUser();
    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext("tech.xiu.anno");
        UserServiceImpl userService = (UserServiceImpl)context.getBean("getUserServiceImpl");
        userService.addUser();
    }

    /**
     * 使用纯注解的方式：
     *  1：导入junit整合spring的jar包 spring-test
     *  2：导入
     */
    @Test
    public void test3() {
        userServiceAnno.addUser();
    }
}
