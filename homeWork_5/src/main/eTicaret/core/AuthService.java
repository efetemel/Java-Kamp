package core;

import entities.concretes.User;

public interface AuthService {
    boolean loginAuth(User user);
    boolean registerAuth(User user);
}
