package tech.xiu.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Student {

    private String name;

    private Address address;

    private String[] books;

    private List<String> hobbys;

    private Map<String,String> scores;

    private Set<String> games;

    private Properties info;

    private String wife;

}
