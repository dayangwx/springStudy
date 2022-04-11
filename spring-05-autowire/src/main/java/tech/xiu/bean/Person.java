package tech.xiu.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {

    private String name;

    @Autowired
//    @Qualifier(value = "dog22")
//    @Resource
    private Dog dog;

    @Autowired
//    @Qualifier(value = "cat22")
//    @Resource
    private Cat cat;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }
}
