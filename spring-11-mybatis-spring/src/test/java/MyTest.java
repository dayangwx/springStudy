import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.xiu.pojo.Emp;
import tech.xiu.service.EmpService;

import java.util.List;

public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmpService empService = context.getBean("empService", EmpService.class);
        List<Emp> emps = empService.selectEmps();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
