package org.example.K3;

import org.example.K2.PerformanceException;
import org.example.K2.Performer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/k3/spring-idol3.xml");
         List<String> titles = new ArrayList<>(Arrays.asList("duke", "kenny", "hank", "frank", "david", "stevie", "taylor", "harry"));

        for (String title : titles) {
            System.out.println(title.toUpperCase() + "-");
            Performer performer = (Performer) ctx.getBean(title);
            performer.perform();
            System.out.println(" ");
        }
    }
}
