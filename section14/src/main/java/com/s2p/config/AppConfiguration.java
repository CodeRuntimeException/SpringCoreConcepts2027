package com.s2p.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackageClasses = {
            com.s2p.beans.Vehicle.class,
            com.s2p.beans.Person.class
        }
)
public class AppConfiguration
{

}
