package learnJava.spring.core.configuration;

import learnJava.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConf {

    @Bean
    public Bar bar(){
        return new Bar();
    }
}
