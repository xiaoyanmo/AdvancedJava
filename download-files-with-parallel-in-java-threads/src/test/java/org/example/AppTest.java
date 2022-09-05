package org.example;

import org.junit.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private String IMAGE_URL = "https://www.google.com/assets/images/srpr/logo11w.png";
    private String IMAGE_URL_WITH_PARAMS = "http://www.google.com/assets/images/srpr/logo11w.png?something=whatever";

    @Test
    public void fileNameUrl_java7() throws MalformedURLException {
        URL url = new URL(IMAGE_URL);
        String file = url.getFile();
        System.out.println(file);

        Path fileName = Paths.get(IMAGE_URL);
        assertEquals("logo11w.png", fileName.getFileName().toString());
    }
}
