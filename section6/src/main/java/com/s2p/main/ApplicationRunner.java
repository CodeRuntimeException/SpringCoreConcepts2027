package com.s2p.main;

import com.s2p.beans.Vehicle;
import com.s2p.config.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Vehicle vehicle =  context.getBean(Vehicle.class);
        System.out.println("Vehicle Bean Fetched From Spring Context : " + vehicle);
        System.out.println("Vehicle Bean Name : " + vehicle.getName());
    }
}
