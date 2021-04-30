package com.ersozyazilim;
import com.ersozyazilim.Models.Instructor;
import com.ersozyazilim.Models.Student;
import com.ersozyazilim.Models.User;
import com.ersozyazilim.Services.InstructorManager;
import com.ersozyazilim.Services.StudentManager;
import com.ersozyazilim.Services.UserManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student efe = new Student(1,"efetemel","Efe Temel","ERSÖZ","123321",836,"11/C",null);
        Student burak = new Student(2,"burak","lewendev","burak","123321",836,"11/C",null);

        Instructor engin = new Instructor(3,"engin","Engin","Demiroğ","123321",012345,"Proggraming Language",160000);

        List<User> users = new ArrayList<>();
        users.add(efe);

        UserManager userManager = new UserManager();
        userManager.addUsers(users);

        StudentManager studentManager = new StudentManager();
        studentManager.addExam(burak,"Ödev");

        UserManager studentManager1 = new InstructorManager();

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addSalary(engin,16000);

    }
}
