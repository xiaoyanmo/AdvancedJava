package org.example;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadFileTask implements Runnable {

    private String url;
    private final String toPath;

    public DownloadFileTask(String url, String toPath) {
        this.url = url;
        this.toPath = toPath;
    }

    @Override
    public void run() {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get(toPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}