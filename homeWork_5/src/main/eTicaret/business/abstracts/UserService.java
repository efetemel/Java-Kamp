package business.abstracts;

import core.AuthService;
import entities.concretes.User;

import java.util.List;
import java.util.function.Predicate;

public interface UserService {
    void registerUser(User user);
    void registerUser(User user, AuthService authService);
    void updateUser(User user);
    void deleteUser(User user);
    void loginUser(User user);
    void loginUser(User user,AuthService authService);
    void confirmEmail(String email);
    User getUser(Predicate<User> userPredicate);
    List<User> getAllUser();
}
