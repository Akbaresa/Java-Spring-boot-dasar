package learnJava.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learnJava.spring.core.data.Foo;

public class PrimaryTest {

    private ApplicationContext ApplicationContext;

    @BeforeEach
    void setUp() {
        ApplicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimary() {
        Foo foo = ApplicationContext.getBean(Foo.class);
        Foo foo1 = ApplicationContext.getBean("foo1", Foo.class);
        Foo foo2 = ApplicationContext.getBean("foo2", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);
    }
}
