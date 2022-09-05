package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.display();
    }
}
