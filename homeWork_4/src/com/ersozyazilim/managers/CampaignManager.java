package com.ersozyazilim.managers;

import com.ersozyazilim.entites.Campaign;

public class CampaignManager implements CampaignService{

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" Adlı kampanya eklendi");
    }

    @Override
    public void delCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" Adlı kampanya silindi");
    }
}
