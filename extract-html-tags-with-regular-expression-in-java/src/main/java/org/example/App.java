package org.example;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {


    private static void extractWebPageTitle(String html) {
        Pattern pattern = Pattern.compile("<title>(.*?)</title>");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    private static void extractCss(String html) {
        Pattern pattern = Pattern.compile("<link.*\\s+rel=\"stylesheet\"([^>]+)>");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println("========================================");
        }
    }

    private static void extractJavascripts(String html) {
        Pattern pattern = Pattern.compile("<script.*\\s+type=\"text/javascript\"([^>]+)></script>");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println("========================================");
        }
    }

    private static void extractLinks(String html) {
        Pattern pattern = Pattern.compile("<a href=\"(.*?)\">.+</a>");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println("==========================");
        }
    }

    private static void extractImages(String html) {
        Pattern pattern = Pattern.compile("<img src=\"(.*?)\">");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println("=========================================");
        }
    }

    /**
     * String root_path_1 = a.class.getClassLoader (). GetResource (""). GetFile (); // Default slave root path lookup
     *  String root_path_2 = a.class.getResource ("/"). GetFile (); // Default from the Class Current Path Find
     * @param args
     */
    public static void main(String[] args) {

        try {
            Path path = Paths.get(App.class.getClassLoader().getResource("index.html").toURI());
            String s = path.toUri().toString();


            String html = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

            System.out.println("Extract Web Page Title");
            extractWebPageTitle(html);

            System.out.println("\nExtract CSS Links");
            extractCss(html);

            System.out.println("\nExtract JavaScript Links");
            extractJavascripts(html);

            System.out.println("\nExtract HTML Links");
            extractLinks(html);

            System.out.println("\nExtract Images");
            extractImages(html);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
