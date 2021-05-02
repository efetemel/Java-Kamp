package com.ersozyazilim.managers;

import com.ersozyazilim.Utils;
import com.ersozyazilim.entites.Campaign;
import com.ersozyazilim.entites.Game;
import com.ersozyazilim.entites.User;
import com.ersozyazilim.logSystem.Logger;

public class GameManager implements GameService{

    private Logger[] loggers;

    public GameManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    @Override
    public void sell(Game game, User user) {
        if(user.getMoney() >= game.getGamePrice()){
            System.out.println(user.getUsername()+" "+game.getGameName()+" Adlı oyunu "+game.getGamePrice()+" fiyata satın aldı.");
            Utils.setLog(loggers,user.getUsername()+" "+game.getGameName()+" Adlı oyunu "+game.getGamePrice()+" fiyata satın aldı.");
        }
        else{
            System.out.println(user.getUsername()+" "+game.getGameName()+" Adlı oyunu "+game.getGamePrice()+" almaya parası yetersiz.");
        }

    }

    @Override
    public void sell(Game game, User user, Campaign campaign) {

        double price = game.getGamePrice() * campaign.getCampaignRate() / 100;
        if(user.getMoney() >= price) {
            System.out.println(user.getUsername() + " " + game.getGameName() + " Adlı oyunu " + price + " %" + campaign.getCampaignRate() +" "+campaign.getCampaignName()+" indirimli fiyata satın aldı.");
            Utils.setLog(loggers, user.getUsername() + " " + game.getGameName() + " Adlı oyunu " + price + " %" + campaign.getCampaignRate() +" "+campaign.getCampaignName()+" indirimli fiyata satın aldı.");
        }
        else{
            System.out.println(user.getUsername()+" "+game.getGameName()+" Adlı oyunu "+price+" almaya parası yetersiz.");
        }
    }

    @Override
    public void addGame(Game game) {
        System.out.println(game.getGameName()+" Adlı oyun eklendi.");
        Utils.setLog(loggers, game.getGameName()+" Adlı oyun eklendi.");
    }

    @Override
    public void delGame(Game game) {
        System.out.println(game.getGameName()+" Adlı oyun silindi.");
        Utils.setLog(loggers, game.getGameName()+" Adlı oyun silindi.");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName()+" Adlı oyun güncellendi.");
        Utils.setLog(loggers, game.getGameName()+" Adlı oyun güncellendi.");
    }
}
