package org.example;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Keyword: ");
            String keyword = scanner.nextLine();

            String path = "D:\\tmp\\log";
            Path startDir = Paths.get(path);
            String pattern = "*.log";
            FileSystem fileSystem = FileSystems.getDefault();
            PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:" + pattern);
            FileVisitor<Path> fileVisitor = new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Path name = file.getFileName();
                    if (pathMatcher.matches(name)) {
                        List<String> lines = Files.readAllLines(Paths.get(path + "/" + name.getFileName()));
                        for (String line : lines) {
                            if (line.toLowerCase().contains(keyword.toLowerCase())) {
                                System.out.println(line);
//                                break;
                            }
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }
            };
            Files.walkFileTree(startDir, fileVisitor);
        } catch (Exception e) {
            System.err.println("Ex: " + e.getMessage());
        }

    }

}