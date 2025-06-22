package tech.xiu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.xiu.config.SpringConfigForAnno;
import tech.xiu.dao.BookDao;
import tech.xiu.service.BookService;

public class App2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigForAnno.class);
//        BookService bookService = context.getBean("bookService", BookService.class);
//        bookService.getData();

        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.getData();
    }
}
