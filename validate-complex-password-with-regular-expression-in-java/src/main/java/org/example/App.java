package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    private static boolean isValid(String password) {
        String complexPasswordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
        Pattern pattern = Pattern.compile(complexPasswordPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String password1 = "abc123";
        boolean result1 = isValid(password1);
        System.out.println("Result 1: " + result1);

        String password2 = "abc12D@";
        boolean result2 = isValid(password2);
        System.out.println("Result 2: " + result2);

    }
}
