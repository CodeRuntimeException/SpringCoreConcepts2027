package com.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String personName;

    @Autowired
    private Vehicle vehicle = null;

    public Person()
    {
        System.out.println("Person Bean Created");
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
