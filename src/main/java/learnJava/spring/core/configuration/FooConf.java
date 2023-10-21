package learnJava.spring.core.configuration;

import learnJava.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConf {

    @Bean
    public Foo foo(){
        return new Foo();
    }
}
