package com.s2p.config;

import com.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Vehicle vehicle()
    {
        System.out.println("Vehicle Bean Created");
        Vehicle ferrari = new Vehicle();
        ferrari.setName("Ferrari Italia 458");
        return ferrari;
    }

}
