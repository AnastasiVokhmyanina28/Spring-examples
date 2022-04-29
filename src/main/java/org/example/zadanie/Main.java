package org.example.zadanie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/zadanie/zadanie.xml");
        M m = ctx.getBean(M.class);
        System.out.println(m.getP());
        P p = ctx.getBean(P.class);
        System.out.println(p.getM());
    }
}