package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.NestedClass nestedClass = outerClass.new NestedClass();
        nestedClass.display();
    }
}
