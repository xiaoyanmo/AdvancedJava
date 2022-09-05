package org.example;

import jdk.nashorn.internal.runtime.URIUtils;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        try {
            ParallelTasks tasks = new ParallelTasks();
            URL url1 = new URL("http://learningprogramming.net/wp-content/uploads/shoesreviews/feet-shoes-1.jpg");
            URL url2 = new URL("http://learningprogramming.net/wp-content/uploads/shoesreviews/feet-shoes-2.jpg");
            URL url3 = new URL("http://learningprogramming.net/wp-content/uploads/shoesreviews/feet-shoes-3.jpg");

            URL[] urls = {url1, url2, url3};
            for (URL url : urls) {
                tasks.add(new DownloadFileTask(url.toString(), "D:\\tmp\\img\\" + Paths.get(url.getFile()).getFileName().toString()));
            }
            tasks.go();
            Logger.getGlobal().log(Level.INFO,"下载成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
