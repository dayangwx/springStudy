import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.xiu.dao.DataDaoMysql;
import tech.xiu.dao.DataDaoOracle;
import tech.xiu.dao.DataDaoSqlserve;
import tech.xiu.service.DataService;
import tech.xiu.service.impl.DataServiceImpl;


public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataServiceImpl dataService = context.getBean("dataServiceImpl", DataServiceImpl.class);
        dataService.getData();
    }
}

