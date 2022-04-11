package tech.xiu.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component  // 相当于<bean id="user" class=""/>
public class User {

    @Value("liuwx")  // 相当于 <property name="name" value="liuwx"/>
    private String name;
}
