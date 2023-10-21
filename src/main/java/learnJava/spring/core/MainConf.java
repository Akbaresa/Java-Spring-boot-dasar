package learnJava.spring.core;

import learnJava.spring.core.configuration.BarConf;
import learnJava.spring.core.configuration.FooConf;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(value = {
  FooConf.class ,
  BarConf.class
})
public class MainConf {

}
