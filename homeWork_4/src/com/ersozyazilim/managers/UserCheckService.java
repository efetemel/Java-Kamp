package com.ersozyazilim.managers;

import com.ersozyazilim.entites.User;

public interface UserCheckService {
    boolean checkIfRealUser(User user);
}
