package learnJava.spring.core;


import learnJava.spring.core.data.Bar;
import learnJava.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConf {


    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }


    //jika lazy dia tidak akan langsung dipanggil ketika app dijalankan
    @Lazy
    @Bean
    public Bar  barLazy(){
        log.info("lazy");
        return new Bar();
    }
}
