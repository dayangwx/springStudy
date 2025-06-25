package tech.xiu.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("tech.xiu")
@EnableAspectJAutoProxy
@Import(AspectLogConfig.class) // 导入切面配置类
public class MyAnnoConfig {
}
