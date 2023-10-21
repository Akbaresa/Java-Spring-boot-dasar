package learnJava.spring.core;

import learnJava.spring.core.data.Foo;
import learnJava.spring.core.data.FooBar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    private ApplicationContext applicationContextcontext ;

    @BeforeEach
    void setUp(){
        applicationContextcontext = new AnnotationConfigApplicationContext(DependsOnConf.class);
    }

    @Test
    void testDependsOn(){
        Foo foo = applicationContextcontext.getBean(Foo.class);
    }
}
