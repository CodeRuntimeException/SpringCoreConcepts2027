package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.beans.Vehicle;
import com.s2p.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args)
    {
        var context =  new AnnotationConfigApplicationContext(AppConfig.class);
        Person person =  context.getBean(Person.class);
        System.out.println("Spring Bean Fetched : " + person.getPersonName());
        Vehicle vehicle = person.getVehicle();
        System.out.println("Vehicle Owned By Person : " + vehicle.getName());
    }
}
