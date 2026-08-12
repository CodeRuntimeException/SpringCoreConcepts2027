package com.s2p.beans;

public class Vehicle
{
    private String vehicleName;

    public Vehicle()
    {
        System.out.println("Vehicle Bean Created By Spring IOC Container");
    }


    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
