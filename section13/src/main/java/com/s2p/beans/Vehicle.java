package com.s2p.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private String vehicleName;

    public Vehicle()
    {
        System.out.println("Vehicle Bean Created");
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
