package com.s2p.beans;

public class Person
{
    private Long personId;
    private String firstName;
    private String lastName;
    private Boolean isRich;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getRich() {
        return isRich;
    }

    public void setRich(Boolean rich) {
        isRich = rich;
    }
}
