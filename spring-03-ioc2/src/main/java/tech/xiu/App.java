package tech.xiu;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import tech.xiu.dao.BookDao;
import tech.xiu.service.BookService;

public class App {

    public static void main(String[] args) {
//        getSpringContextByAbsolutPath();
//        getSpringContextByRelativePath();
    }

    private static void getSpringContextByRelativePath() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.getData();
    }

    private static void getSpringContextByAbsolutPath() {
        // 绝对路经创建spring容器
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("D:\\workspace..\\application.xml");
        // 获取bean
//        Object bookDao = fileSystemXmlApplicationContext.getBean("bookDao", BookDao.class);

        ClassPathResource classPathResource = new ClassPathResource("application.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(classPathResource);
//        factory.getBean()
    }
}
