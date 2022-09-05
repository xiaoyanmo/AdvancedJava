package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    private static boolean isValid(String url) {
        String urlPattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Pattern pattern = Pattern.compile(urlPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String url1 = "abc.com";
        boolean result1 = isValid(url1);
        System.out.println("Result 1: " + result1);

        String url2 = "http://abc.com";
        boolean result2 = isValid(url2);
        System.out.println("Result 2: " + result2);

    }
}
