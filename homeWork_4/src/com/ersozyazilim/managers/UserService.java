package com.ersozyazilim.managers;

import com.ersozyazilim.entites.User;

public interface UserService {
    void register(User user);
    void login(User user);
    void update(User user);
}
