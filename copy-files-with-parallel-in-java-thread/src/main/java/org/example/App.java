package org.example;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        try {
            ParallelTasks tasks = new ParallelTasks();
            File folder = new File("D:\\tmp\\img\\");
            for (File file : folder.listFiles()) {
                tasks.add(new CopyFileTask(file.getAbsolutePath(), "D:\\tmp\\toimg\\" + file.getName()));
            }
            tasks.go();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
