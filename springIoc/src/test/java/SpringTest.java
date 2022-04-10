import tech.xiu.dao.DataDaoOracle;
import tech.xiu.dao.DataDaoSqlserve;
import tech.xiu.service.DataService;
import tech.xiu.service.impl.DataServiceImpl;


public class SpringTest {

    public static void main(String[] args) {
        DataService dataService = new DataServiceImpl();
        dataService.setDataDao(new DataDaoSqlserve());
        dataService.getData();
    }
}
