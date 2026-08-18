package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person =  context.getBean(Person.class);
        person.getVehicle().getVehicleServices().startJourney();
    }
}
