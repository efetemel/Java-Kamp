package com.ersozyazilim.entites;

import java.util.Date;

public class User implements Entity {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private double money;
    private String nationalityId;
    private Date dateOfBird;

    public User(int id, String username, String firstName, String lastName, String password, String email, double money, String nationalityId, Date dateOfBird) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.money = money;
        this.nationalityId = nationalityId;
        this.dateOfBird = dateOfBird;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
