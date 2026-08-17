package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Person Bean Is Lazy Initialized");
        Person p1 = context.getBean(Person.class);
//        Person p2 = context.getBean(Person.class);
//
//        if(p1.equals(p2))
//        {
//            System.out.println("Person Bean Is A Singleton Bean Scope");
//        }
//        else
//        {
//            System.out.println("Person Bean Is Prototype Bean Scope");
//        }

    }
}
