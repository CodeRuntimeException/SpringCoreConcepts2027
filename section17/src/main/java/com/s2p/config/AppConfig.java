package com.s2p.config;

import com.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan(
        basePackages = {
                "com.s2p.beans"
        }
)
@Configuration
public class AppConfig
{
    @Bean(name = "ferrariBean")
    Vehicle vehicle1()
    {
        System.out.println("Ferrari Bean Created");
        Vehicle ferrari = new Vehicle();
        ferrari.setVehicleName("Ferrari Italia 458");
        return ferrari;
    }


    @Bean(name = "audiBean")
    Vehicle vehicle2()
    {
        System.out.println("Audi Bean Created");
        Vehicle audi = new Vehicle();
        audi.setVehicleName("Audi r8");
        return audi;
    }

    @Bean(name = "mercedesBean")
    Vehicle vehicle3()
    {
        System.out.println("Mercedes Bean Created");
        Vehicle mercedes = new Vehicle();
        mercedes.setVehicleName("Mercedes S-Class");
        return mercedes;
    }
}
