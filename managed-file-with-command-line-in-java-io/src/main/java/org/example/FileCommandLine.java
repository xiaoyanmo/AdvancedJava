package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCommandLine {

    private File folder;

    public FileCommandLine() {
        folder = new File("c:\\");
    }

    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            String key;
            do {
                System.out.print(folder.getAbsolutePath() + ">");
                String command = scanner.nextLine();
                if (getCommandName(command).equalsIgnoreCase("cd")) {
                    // Example use this command line: cd c:\data
                    changeFolder(command);
                } else if (getCommandName(command).equalsIgnoreCase("mkdir")) {
                    // Example use this command line: mkdir abc
                    createFolder(command);
                } else if (getCommandName(command).equalsIgnoreCase("mkfile")) {
                    // Example use this command line: mkfile a.txt hello
                    createFile(command);
                } else if (getCommandName(command).equalsIgnoreCase("delete")) {
                    // Example use this command line: delete a.txt
                    deleteFile(command);
                } else if (getCommandName(command).equalsIgnoreCase("rename")) {
                    // Example use this command line: rename a.txt b.txt
                    renameFile(command);
                } else if (getCommandName(command).equalsIgnoreCase("listFile")) {
                    // Example use this command line: listFile
                    listFile();
                } else if (getCommandName(command).equalsIgnoreCase("listFolder")) {
                    // Example use this command line: listFolder
                    listFolder();
                }
                System.out.print("Press Y(y) to continue ");
                key = scanner.nextLine();
            } while (key.equalsIgnoreCase("y"));
            System.out.println("Done");
            scanner.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String getCommandName(String command) {
        return command.split(" ")[0];
    }

    private void changeFolder(String command) {
        String[] result = command.split(" ");
        folder = new File(result[1]);
        System.out.println(folder.getAbsolutePath() + ">");
    }

    private void listFolder() {
        try {
            for (File file : folder.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println("Folder Name: " + file.getName());
                    System.out.println("====================");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void listFile() {
        try {
            for (File file : folder.listFiles()) {
                System.out.println("File Name: " + file.getName());
                System.out.println("File Size(bytes): " + file.length());
                System.out.println("=========================");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void renameFile(String command) {
        try {
            String[] result = command.trim().split(" ");
            File file = new File(folder.getAbsolutePath() + "\\" + result[1]);
            if (!file.renameTo(new File(folder.getAbsolutePath() + "\\" + result[2]))) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void deleteFile(String command) {
        try {
            String[] result = command.trim().split(" ");
            File file = new File(folder.getAbsolutePath() + "\\" + result[1]);
            if (!file.delete()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void createFile(String command) {
        try {
            String[] result = command.trim().split(" ");
            File file = new File(folder.getAbsolutePath() + "\\" + result[1]);
            if (file.createNewFile()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(result[2].getBytes());
                fileOutputStream.close();
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void createFolder(String command) {
        try {
            String[] result = command.trim().split(" ");
            File file = new File(folder.getAbsolutePath() + "\\" + result[1]);
            file.mkdir();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}