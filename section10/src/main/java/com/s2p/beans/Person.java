package com.s2p.beans;

import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String name = "Steve Jobs";

    public Person()
    {
        System.out.println("Person Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
