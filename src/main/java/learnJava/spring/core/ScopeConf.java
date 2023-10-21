package learnJava.spring.core;

import learnJava.spring.core.data.Bar;
import learnJava.spring.core.data.Foo;
import learnJava.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConf {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new Foo");
        return  new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton" , new DoubletonScope());

        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar() ;
    }
}
