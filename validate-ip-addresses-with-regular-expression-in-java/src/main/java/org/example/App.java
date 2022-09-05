package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    private static boolean isValid(String ip) {
        String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(ipPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String ip1 = "12.45.13";
        boolean result1 = isValid(ip1);
        System.out.println("Result 1: " + result1);

        String ip2 = "12.45.13.78";
        boolean result2 = isValid(ip2);
        System.out.println("Result 2: " + result2);

    }
}
