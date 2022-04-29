package org.example.zadanie2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAB {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/zadanie2/zadanie2.xml");
       B b = context.getBean(B.class);
        b.getA().printA();
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