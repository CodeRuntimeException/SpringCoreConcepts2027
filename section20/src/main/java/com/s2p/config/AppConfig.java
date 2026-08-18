package com.s2p.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackageClasses = {com.s2p.services.VehicleServices.class},
        basePackages = {"com.s2p.beans", "com.s2p.implementations"}
)
public class AppConfig
{

}
