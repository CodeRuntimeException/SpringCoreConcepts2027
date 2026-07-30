package com.s2p.config;

import com.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig
{
    @Bean(name = "ferrariVehicle")
    Vehicle vehicle1()
    {
        System.out.println("Ferrari Bean Created.....");
        Vehicle ferrari = new Vehicle();
        ferrari.setName("Ferrari Italia 458");
        return ferrari;
    }

    @Bean(name = "audiVehicle")
    Vehicle vehicle2()
    {
        System.out.println("Audi Bean Created.....");
        Vehicle audi = new Vehicle();
        audi.setName("Audi R8");
        return audi;
    }

    @Primary
    @Bean(name = "mercedesVehicle")
    Vehicle vehicle3()
    {
        System.out.println("Mercedes Bean Created.....");
        Vehicle mercedes = new Vehicle();
        mercedes.setName("Mercedes S Class");
        return mercedes;
    }


}
