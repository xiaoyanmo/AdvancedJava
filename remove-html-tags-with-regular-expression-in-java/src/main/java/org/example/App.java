package org.example;

/**
 * Hello world!
 */
public class App {
    private static String removeHTMLTags(String content) {
        String htmlTagPattern = "\\<.*?\\>";
        return content.replaceAll(htmlTagPattern, "");
    }

    public static void main(String[] args) {

        String content = "<p>Paragraph 1</p><p>Paragraph 2</p><img src=\"images/a.gif\" width=\"120\" height=\"100\"><img src=\"images/b.gif\" width=\"120\" height=\"100\"><a href=\"abc.com\">Link 1</a><a href=\"def.net\">Link 2</a>";
        String result = removeHTMLTags(content);
        System.out.println(result);

    }
}
