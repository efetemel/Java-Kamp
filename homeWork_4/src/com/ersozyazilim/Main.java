package com.ersozyazilim;

import com.ersozyazilim.entites.Campaign;
import com.ersozyazilim.entites.Game;
import com.ersozyazilim.entites.User;
import com.ersozyazilim.logSystem.DatabaseLogger;
import com.ersozyazilim.logSystem.Logger;
import com.ersozyazilim.logSystem.SmsLogger;
import com.ersozyazilim.managers.GameManager;
import com.ersozyazilim.managers.UserManager;
import com.ersozyazilim.managers.adapters.EdevletServiceAdapter;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(),new SmsLogger()};
        UserManager userManager = new UserManager(loggers, new EdevletServiceAdapter());
        User user = new User(1, "efetemel", "Efe Temel","ERSÖZ","123321","ersozyazilim@gmail.com",500,"11111111111",new Date(2004,02,27));
        userManager.register(user); // Kullanıcı kayıtı
        Game game = new Game(1,"Minecraft",80);
        GameManager gameManager = new GameManager(loggers);
        Campaign campaign = new Campaign(1,"Yılbaşı Kampanyası",18);
        gameManager.sell(game,user,campaign); // Kampanyalı satış
        gameManager.sell(game,user); // Düz kampanyasız satış

    }
}
