import business.concretes.UserManager;
import core.GoogleAuthAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args){
        UserManager userManager = new UserManager(new HibernateUserDao());
        User user1 = new User(1,"Efe Temel","ERSÖZ","ersozyazilim@gmail.com","123321",false);
        User user2 = new User(1,"E","ERSÖZ","aaersozyazilim@gmail.com","123321",false);
        userManager.registerUser(user1,new GoogleAuthAdapter());
        userManager.confirmEmail(user1.getEmail());
        userManager.confirmEmail(user1.getEmail());
        userManager.loginUser(user1);
    }

}
