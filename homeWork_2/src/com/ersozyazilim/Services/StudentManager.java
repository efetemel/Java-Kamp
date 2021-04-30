package com.ersozyazilim.Services;

import com.ersozyazilim.Models.Student;
import com.ersozyazilim.Models.User;

public class StudentManager extends UserManager {


    public void addExam(Student student, String exam){
        System.out.println(student.getUsername()+" Adlı öğrenciye ödev eklendi!");
    }

    public void delExam(Student student){
        System.out.println(student.getUsername()+" Adlı öğrenciye ödev silindi!");
    }
}
