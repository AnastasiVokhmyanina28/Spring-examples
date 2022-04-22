package org.example.K4;

import org.example.K2.PerformanceException;
import org.example.K2.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicMain4 {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/k4/spring4.xml");
        Performer duke = (Performer) context.getBean("instrumentalist");
        duke.perform();
    }
}
