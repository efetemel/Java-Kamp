package com.ersozyazilim.Services;

import com.ersozyazilim.Models.User;

import java.util.List;

public class UserManager {



    public void addUser(User user){
        System.out.println(user.getUsername()+" Adlı kullanıcı eklendi!");
    }

    public void addUsers(List<User> users){
        for (User user:users){
            System.out.println(user.getUsername()+" Adlı kullanıcı eklendi!");
        }
    }

    public void delUser(User user){
        System.out.println(user.getUsername()+" Adlı kullanıcı silindi!");
    }

    public void delUsers(List<User> users){
        for (User user:users){
            System.out.println(user.getUsername()+" Adlı kullanıcı silindi!");
        }
    }
}
