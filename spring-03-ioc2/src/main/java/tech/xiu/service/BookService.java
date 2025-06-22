package tech.xiu.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BookService {

    public BookService() {
        System.out.println("constructing....");

    }

    public void getData() {
        System.out.println("got data in service.....");
    }

    /**
     * 因为init方法在构造方法后执行，所有init方法的注解叫做PostConstruct
     */
    @PostConstruct
    public void init() {
        System.out.println("initing...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroying....");
    }

}
