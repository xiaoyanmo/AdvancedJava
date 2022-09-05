package org.example;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        File folder = new File("D:\\tmp\\img");
        ImageFilter imageFilter = new ImageFilter();
        File[] files = folder.listFiles(imageFilter);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
