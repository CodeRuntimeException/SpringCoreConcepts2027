package com.s2p.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init()
    {
        this.name = "Maclaren";
    }

    @PreDestroy
    public void destroy()
    {
        this.name = null;
        System.out.println("Destroying The Object");
    }

}

