package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.beans.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("BeansConfig.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Spring Bean Fetched From IOC Container : " + vehicle.getName());

        Person person  =  context.getBean(Person.class);
        System.out.println("Spring Bean Fetched From IOC Container : " + person.getFirstName());
        System.out.println("Spring Bean Fetched From IOC Container : " + person.getLastName());
    }
}
