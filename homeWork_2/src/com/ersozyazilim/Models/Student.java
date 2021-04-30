package com.ersozyazilim.Models;

public class Student extends User{
    private int number;
    private String classNumber;
    private String exam;

    public Student(int id, String username, String firstName, String lastName, String password,int number,String classNumber,String exam) {
        super(id, username, firstName, lastName, password);
        this.number = number;
        this.classNumber = classNumber;
        this.exam = exam;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }
}
