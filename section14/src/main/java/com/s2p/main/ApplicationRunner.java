package com.s2p.main;

import com.s2p.beans.Vehicle;
import com.s2p.config.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.s2p.beans.Person;

public class ApplicationRunner
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Vehicle vehicle =  context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person Name : " + person.getPersonName());
        System.out.println("Vehicle That Person Owns : " + person.getVehicle().getVehicleName());
    }
}
