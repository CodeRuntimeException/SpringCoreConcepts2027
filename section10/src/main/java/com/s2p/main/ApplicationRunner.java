package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.beans.Vehicle;
import com.s2p.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Vehicle vehicle =  context.getBean(Vehicle.class);
        Person person =  context.getBean(Person.class);

        System.out.println("Spring Bean Fetched From IOC Container : " + vehicle.getName());
        System.out.println("Spring Bean Fetched From IOC Container : " + person.getName());
    }
}
