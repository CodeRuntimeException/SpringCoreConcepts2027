package com.s2p.beans;

import com.s2p.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private VehicleServices vehicleServices = null;

    @Autowired
    public Vehicle(VehicleServices vehicleServices)
    {
        this.vehicleServices = vehicleServices;
        System.out.println("Vehicle Bean Is Created");
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }
}
