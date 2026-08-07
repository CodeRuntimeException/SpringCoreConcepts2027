package com.s2p.config;

import com.s2p.beans.Person;
import com.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig
{
    @Bean
    public Vehicle vehicle()
    {
        Vehicle v = new Vehicle();
        v.setVehicleName("Ferrari Italia 458");
        return v;
    }

    @Bean
    public Person person(Vehicle vehicle)
    {
        Person p = new Person();
        p.setVehicle(vehicle);
        p.setPersonName("Steve Jobs");
        return p;
    }
}
