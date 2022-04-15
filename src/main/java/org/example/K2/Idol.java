package org.example.K2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Idol {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "META-INF/spring/k2/spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();
    }
}
