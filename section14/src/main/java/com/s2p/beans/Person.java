package com.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String personName;

    private Vehicle vehicle = null;

    public Person()
    {
        System.out.println("Person Bean Created");
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Autowired
    public void setVehicle(Vehicle vehicle)
    {
        System.out.println("Vehicle Bean Injected");
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
