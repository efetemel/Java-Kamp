package business.concretes;

import business.abstracts.UserService;
import core.AuthService;
import core.GoogleAuthAdapter;
import core.Utils;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private UserDao dao;

    public UserManager(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void registerUser(User user) {
        //İş kodları
        if (Utils.userValidation(user) && !checkIfUser(user)){
            this.dao.addUser(user);
            Utils.sendEmail(user.getEmail(),"Epostanızı onaylamak için tıklayınız.");
        }
        else if(!Utils.userValidation(user)){
            System.out.println("Kullanıcı bilgileri uygunsuz.");
        }
        else{
            System.out.println("Sistemde böyle bir eposta zaten kayıtlı.");
        }

    }

    @Override
    public void registerUser(User user,AuthService authService) {
        //İş kodları

        if (Utils.userValidation(user) && !checkIfUser(user) && authService.registerAuth(user)){
            this.dao.addUser(user);
            System.out.println("Servis kullanılanarak kayıt oldu.");
            Utils.sendEmail(user.getEmail(),"Epostanızı onaylamak için tıklayınız.");
        }
        else if(!Utils.userValidation(user)){
            System.out.println("Kullanıcı bilgileri uygunsuz.");
        }
        else{
            System.out.println("Sistemde böyle bir eposta zaten kayıtlı.");
        }
    }

    @Override
    public void updateUser(User user) {
        //İş kodları
        if (Utils.userValidation(user)){
            this.dao.updateUser(user);
        }
    }

    @Override
    public void deleteUser(User user) {
        //İş kodları
        this.dao.deleteUser(user);
    }

    @Override
    public void loginUser(User user) {
        if(dao.getUser(user1 -> user.getEmail() == user1.getEmail()) != null){
            System.out.println("Sisteme başarıyla giriş yaptınız.");
        }
        else{
            System.out.println("Eposta veya şifre yanlış lütfen tekrar deneyiniz.");
        }
    }

    @Override
    public void loginUser(User user,AuthService authService) {
        if(dao.getUser(user1 -> user.getEmail() == user1.getEmail()) != null && authService.loginAuth(user)){
            System.out.println("Sisteme başarıyla giriş yaptınız.");
        }
        else{
            System.out.println("Eposta veya şifre yanlış lütfen tekrar deneyiniz.");
        }
    }

    @Override
    public void confirmEmail(String email) {
        User realUser = dao.getUser(dbUser -> dbUser.getEmail() == email);
        if(realUser.isConfirmed()){
            System.out.println("Eposta zaten onaylanmış!");
        }
        else{
            realUser.setConfirmed(true);
            System.out.println("Epostanız onaylandı");
        }
    }

    @Override
    public User getUser(Predicate<User> userPredicate) {
       return dao.getUser(userPredicate);
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }



    public boolean checkIfUser(User user){

        User realUser = dao.getUser(dbUser -> dbUser.getEmail() == user.getEmail());
        if (realUser != null){
            return true;
        }
        else {
            return false;
        }
    }



}
