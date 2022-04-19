import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.xiu.config.SpringMybatisConfig;
import tech.xiu.pojo.Emp;
import tech.xiu.service.EmpService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMybatisConfig.class})
public class MyTest {

    @Autowired
    private EmpService empService;

    @Test
    public void test1() {
        List<Emp> emps = empService.selectEmps();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

}
