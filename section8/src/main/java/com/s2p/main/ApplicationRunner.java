package com.s2p.main;

import com.s2p.beans.Vehicle;
import com.s2p.config.AppConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class ApplicationRunner
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle =  context.getBean(Vehicle.class);
        System.out.println("Vehicle Bean Fetched From Spring IOC Container : " + vehicle.getName());


        Supplier<Vehicle> bmwSupplier = new Supplier<Vehicle>()
        {
            public Vehicle get()
            {
                Vehicle bmw = new Vehicle();
                bmw.setName("BMW M4");
                return bmw;
            }
        };


        Supplier<Vehicle> macLarenSupplier = new Supplier<Vehicle>(){
            public Vehicle get()
            {
                Vehicle maclaren = new Vehicle();
                maclaren.setName("Maclaren V8");
                return maclaren;
            }
        };


        Random random = new Random();
        int number = random.nextInt(100,400);

        if(number % 2 == 0)
        {
            context.registerBean("bmwVehicle", Vehicle.class,bmwSupplier);
        }
        else
        {
            context.registerBean("maclarenVehicle", Vehicle.class,macLarenSupplier);
        }

        try {
            Vehicle bmw = context.getBean("bmwVehicle", Vehicle.class);
            System.out.println("Vehicle Bean From Spring Context : " + bmw.getName());
        }
        catch (NoSuchBeanDefinitionException e)
        {
            System.out.println("BMW Bean Is Not Present");
        }

        try {
            Vehicle maclaren = context.getBean("maclarenVehicle", Vehicle.class);
            System.out.println("Vehicle Bean From Spring Context : " + maclaren.getName());
        }
        catch (NoSuchBeanDefinitionException e)
        {
            System.out.println("Maclaren Is Not Present Inside Spring Context");
        }


        context.close();

    }
}
