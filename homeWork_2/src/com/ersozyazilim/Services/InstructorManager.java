package com.ersozyazilim.Services;

import com.ersozyazilim.Models.Instructor;
import com.ersozyazilim.Models.Student;

public class InstructorManager extends UserManager{

    public void addSalary(Instructor instructor, int salary){
        System.out.println(instructor.getUsername()+" adlı eğitmen maaşı düzenlendi!");
    }

    public void delSalary(Instructor instructor,int salary){
        System.out.println(instructor.getUsername()+" adlı eğitmen maaşı sıfırlandı!");
    }
}
