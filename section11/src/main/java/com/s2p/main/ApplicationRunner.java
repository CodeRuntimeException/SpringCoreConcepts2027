package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.beans.Vehicle;
import com.s2p.config.ApplicationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Vehicle v =  context.getBean(Vehicle.class);
        Person p =  context.getBean(Person.class);

        System.out.println("Vehicle Bean From Spring Context : " + v.getVehicleName());
        System.out.println("Person Bean From Spring Context :  " + p.getPersonName());

    }
}
