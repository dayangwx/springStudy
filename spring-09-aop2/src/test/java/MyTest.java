import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.xiu.AspectConfig;
import tech.xiu.UserService;

@RunWith(SpringJUnit4ClassRunner.class)                // junit整合spring，固定写法
@ContextConfiguration(classes = {AspectConfig.class})  // 加载AspectConfig配置
public class MyTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
//        userService.addUser();
        userService.isSucceed();
    }
}
