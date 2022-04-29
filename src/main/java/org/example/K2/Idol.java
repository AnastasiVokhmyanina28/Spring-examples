package org.example.K2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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


//
/*@Component
 class A{
    @Autowired
    C b;
}

interface C {
    void print();
}
@Component
 class B implements C{
    public void print(){
        System.out.println("B");
    }
}


class main{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "META-INF/spring/k2/spring-idol.xml");
        ctx.getBean(A.class);
        a.b.print();
    }
}
*/