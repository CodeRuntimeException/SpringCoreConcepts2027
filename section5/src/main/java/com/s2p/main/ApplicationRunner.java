package com.s2p.main;

import com.s2p.beans.Vehicle;
import com.s2p.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args)
    {
        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle =  context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
    }
}
