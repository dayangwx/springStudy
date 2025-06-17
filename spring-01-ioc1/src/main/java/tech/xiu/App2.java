package tech.xiu;

import lombok.val;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.xiu.dao.DataDao;
import tech.xiu.service.DataService;

public class App2 {

    public static void main(String[] args) {
        // 获取spring上下文，即spring容器
        // 要管理的对象配置在了beans.xml文件中
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 获取容器中的bean对象
//        DataService dataServiceImpl = applicationContext.getBean("dataServiceImpl", DataService.class);
//        dataServiceImpl.getData();

        DataDao dataDao = (DataDao) applicationContext.getBean("dataDao");
        dataDao.getData();

        applicationContext.registerShutdownHook();


//        applicationContext.getEnvironment().resolveRequiredPlaceholders("beans.xml");

    }
}
