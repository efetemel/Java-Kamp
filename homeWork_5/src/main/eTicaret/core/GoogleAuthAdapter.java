package core;

import entities.concretes.User;
import googleAuth.GoogleAuth;

public class GoogleAuthAdapter implements AuthService{

    private GoogleAuth googleAuth = new GoogleAuth();

    @Override
    public boolean loginAuth(User user) {
        return googleAuth.loginGoogle(user.getEmail());
    }

    @Override
    public boolean registerAuth(User user) {
        return googleAuth.registerGoogle(user.getEmail());
    }
}
