package org.example;

import java.io.File;
import java.io.FilenameFilter;

public class ImageFilter implements FilenameFilter {
    private String[] extensions = {"gif", "jpg", "jepg", "png"};

    @Override
    public boolean accept(File dir, String name) {
        if (dir.exists()) {
            for (String extension : extensions) {
                if (name.endsWith(extension)) {
                    return true;
                }
            }
        }
        return false;
    }
}
