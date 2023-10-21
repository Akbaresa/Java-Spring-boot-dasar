package learnJava.spring.core;

import learnJava.spring.core.data.Connection;
import learnJava.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConf {

    @Bean
    public Connection connection(){
        return new Connection();
    }


    @Bean
//    @Bean(initMethod = "start" , destroyMethod = "stop")
    public Server server(){
        return new Server();
    }

}
