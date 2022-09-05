package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    private static boolean isValid(String creditCardNumber) {
        String creditCardNumberPattern = "((?:(?:\\d{4}[- ]){3}\\d{4}|\\d{16}))(?![\\d])";
        Pattern pattern = Pattern.compile(creditCardNumberPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(creditCardNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String creditCardNumber1 = "44444444444abc";
        boolean result1 = isValid(creditCardNumber1);
        System.out.println("Result 1: " + result1);

        String creditCardNumber2 = "4444444444444448";
        boolean result2 = isValid(creditCardNumber2);
        System.out.println("Result 2: " + result2);

    }
}
