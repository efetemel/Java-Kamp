package com.ersozyazilim.Models;

public class Instructor extends User{
    private int instructorNumber;
    private String instructorCategory;
    int salary;

    public Instructor(int id, String username, String firstName, String lastName, String password,int instructorNumber,String instructorCategory,int salary) {
        super(id, username, firstName, lastName, password);
        this.instructorNumber = instructorNumber;
        this.instructorCategory = instructorCategory;
        this.salary = salary;
    }

    public int getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorCategory() {
        return instructorCategory;
    }

    public void setInstructorCategory(String instructorCategory) {
        this.instructorCategory = instructorCategory;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
