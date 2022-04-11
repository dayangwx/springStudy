package tech.xiu.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import tech.xiu.pojo.User;

@Configuration
@ComponentScan("tech.xiu.pojo")
public class AnnoConfig {

    @Bean(name = "user")
    public User getUser() {
        return new User();
    }
}
