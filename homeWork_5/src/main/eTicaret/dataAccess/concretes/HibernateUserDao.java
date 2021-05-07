package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getFirstName()+" "+user.getLastName()+" Adlı kullanıcı eklendi.");
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user.getFirstName()+" "+user.getLastName()+" Adlı kullanıcı güncellendi.");
    }

    @Override
    public void deleteUser(User user) {
        System.out.println(user.getFirstName()+" "+user.getLastName()+" Adlı kullanıcı silindi.");
    }

    @Override
    public User getUser(Predicate<User> userPredicate) {

        try{
            User user = getAllUser().stream().filter(userPredicate).toList().get(0);
            return user;
        }
        catch (Exception e){
            return null;
        }

    }

    @Override
    public List<User> getAllUser() {
        return users;
    }
}
