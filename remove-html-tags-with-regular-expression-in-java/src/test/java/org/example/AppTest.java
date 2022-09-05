package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Locale;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        String strProjectName = "EXTRACT HTML TAGS WITH REGULAR EXPRESSION IN JAVA";
        String newStr = strProjectName.replaceAll(" ", "-").toLowerCase(Locale.ROOT);
        System.out.println(newStr);
    }
}
