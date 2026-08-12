package com.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String personName;
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        System.out.println("Person Bean Created By Spring IOC Container");
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
