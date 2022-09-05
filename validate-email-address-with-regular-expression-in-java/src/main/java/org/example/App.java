package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    private static boolean isValid(String email) {
        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String email1 = "abd@gmail";
        boolean result1 = isValid(email1);
        System.out.println("Result 1: " + result1);

        String email2 = "abd@gmail.com";
        boolean result2 = isValid(email2);
        System.out.println("Result 2: " + result2);

    }
}
