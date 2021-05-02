package com.ersozyazilim.managers;

import com.ersozyazilim.entites.Campaign;
import com.ersozyazilim.entites.Game;
import com.ersozyazilim.entites.User;

public interface GameService {
    void sell(Game game, User user);
    void sell(Game game, User user, Campaign campaign);
}
