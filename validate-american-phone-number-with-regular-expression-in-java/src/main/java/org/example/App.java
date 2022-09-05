package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    private static boolean isValid(String phone) {
        String americanPhoneNumberPattern = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(americanPhoneNumberPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String phone1 = "12-12-111";
        boolean result1 = isValid(phone1);
        System.out.println("Result 1: " + result1);

        String phone2 = "123-456-7890";
        boolean result2 = isValid(phone2);
        System.out.println("Result 2: " + result2);

    }

}
