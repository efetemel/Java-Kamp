package com.ersozyazilim.managers.adapters;

import com.ersozyazilim.entites.User;
import com.ersozyazilim.managers.UserCheckService;

public class EdevletServiceAdapter implements UserCheckService {
    @Override
    public boolean checkIfRealUser(User user) {
        return true;//hocam referans yok :D
    }
}
