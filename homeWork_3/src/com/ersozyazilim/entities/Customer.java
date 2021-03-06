package com.ersozyazilim.entities;

import java.util.Date;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private Date DateOfBird;
    private String NationalityId;

    public Customer(int id, String firstName, String lastName, Date dateOfBird, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        DateOfBird = dateOfBird;
        NationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDateOfBird() {
        return DateOfBird;
    }

    public void setDateOfBird(Date dateOfBird) {
        DateOfBird = dateOfBird;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
