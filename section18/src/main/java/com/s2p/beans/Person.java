package com.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private Vehicle vehicle = null;

    @Autowired
    Person(Vehicle vehicle)
    {
        System.out.println("Person Bean Created");
        this.vehicle = vehicle;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
