package com.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String personName;
    private Vehicle vehicle = null;

    @Autowired
    public Person(Vehicle vehicle)
    {
        System.out.println("Vehicle Bean Injected By Spring Framework");
        System.out.println("Person Bean Created By Spring IOC Container");
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
