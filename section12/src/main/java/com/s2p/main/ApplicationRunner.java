package com.s2p.main;

import com.s2p.beans.Person;
import com.s2p.beans.Vehicle;
import com.s2p.config.ApplicationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Person p =  context.getBean(Person.class);
        System.out.println("Person Bean From Spring Context :  " + p.getPersonName());
        Vehicle v =  p.getVehicle();
        System.out.println("Vehicle Bean From Person Bean : " + v.getVehicleName());
    }
}
