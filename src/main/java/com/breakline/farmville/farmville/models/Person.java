package com.breakline.farmville.farmville.models;

public class Person {
    String firstname;
    String lastname;
    Integer identificationNumber;

    public Person() {
    }

    public Person(String firstname, String lastname, Integer identificationNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Integer identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
