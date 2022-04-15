package org.example.K1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightAopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/k1/knights-aop.xml");

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}

