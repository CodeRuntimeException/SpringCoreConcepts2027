package com.s2p.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private String name;

    public Vehicle()
    {
        System.out.println("Vehicle Bean Created By Spring IOC Container");
        this.name = "Ferrari Italia 458";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
