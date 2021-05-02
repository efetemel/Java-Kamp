package com.ersozyazilim.managers;

import com.ersozyazilim.entites.User;
import com.ersozyazilim.logSystem.Logger;

public class UserManager implements UserService {

    private Logger[] loggers;
    private UserCheckService userCheckService;

    public UserManager(Logger[] loggers, UserCheckService userCheckService) {
        this.loggers = loggers;
        this.userCheckService = userCheckService;
    }

    @Override
    public void register(User user) {
        if(userCheckService.checkIfRealUser(user)){
            System.out.println(user.getUsername()+" Kayıt oldu.");
        }
        else{
            System.out.println(user.getUsername()+" Bilgileriniz geçersiz.");
        }
    }

    @Override
    public void login(User user) {
        System.out.println("Başarıyla giriş yapıldı.");
    }

    @Override
    public void update(User user) {
        System.out.println("Başarıyla güncelleme yapıldı.");
    }


}
