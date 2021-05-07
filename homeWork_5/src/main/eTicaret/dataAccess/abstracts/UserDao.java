package dataAccess.abstracts;

import entities.concretes.User;

import java.util.List;
import java.util.function.Predicate;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUser(Predicate<User> predicate);
    List<User> getAllUser();
}
