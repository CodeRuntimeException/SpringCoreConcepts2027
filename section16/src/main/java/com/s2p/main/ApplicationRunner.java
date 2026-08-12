package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person =  context.getBean(Person.class);
        System.out.println("Person Name From Spring IOC Container : " + person.getPersonName());
        System.out.println("Vehicle Owned By The Person From Spring IOC Container : "  + person.getVehicle().getVehicleName());
    }
}
