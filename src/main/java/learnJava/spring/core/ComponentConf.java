package learnJava.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "learnJava.spring.core.service" ,
        "learnJava.spring.core.repository" ,
        "learnJava.spring.core.configuration"

})
public class ComponentConf {


}
