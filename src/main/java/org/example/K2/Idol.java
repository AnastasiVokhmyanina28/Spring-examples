package org.example.K2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Idol {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "META-INF/spring/k2/spring-idol.xml");

        List<String> titles = new ArrayList<>(Arrays.asList("kenny", "duke", "hank"));
        for (String title : titles) {
            System.out.println(title.toUpperCase() + "-");
            Performer performer = (Performer) ctx.getBean(title);
            performer.perform();
            System.out.println(" ");
        }
    }
}
