package core;

import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {


    public static boolean userValidation(User user){
        final Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());
        if (user.getPassword().length() >= 6 && user.getFirstName().length() > 2 && user.getLastName().length() > 2 && matcher.matches()){
            return true;
        }
        else{
            return false;
        }

    }

    public static void sendEmail(String email,String message) {
        System.out.println("[EmailGöndermeServisi] --> "+email +" hesabına "+message+" eposta gönderildi.");
    }
}
