package learnJava.spring.core.configuration;

import learnJava.spring.core.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class CustomerConfiguration {

    // jika ada kasus ingin menggunakan keduanya
    @Primary
    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }
    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }


}
