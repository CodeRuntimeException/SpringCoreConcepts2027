package com.s2p.beans;

import com.s2p.services.VehicleServices;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private VehicleServices vehicleServices = null;

    Vehicle(VehicleServices vehicleServices)
    {
        this.vehicleServices = vehicleServices;
        System.out.println("Vehicle Bean Created");
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }
}
