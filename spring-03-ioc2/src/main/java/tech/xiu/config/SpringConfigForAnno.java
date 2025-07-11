package tech.xiu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("tech.xiu")
@PropertySource(value = "classpath:dbname.properties")
public class SpringConfigForAnno {

}
