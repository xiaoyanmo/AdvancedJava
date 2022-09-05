package org.example;

public class OuterClass {
    private static int x = 10;

    static class StaticNestedClass {
        void display() {
            System.out.println("x: " + x);
        }
    }
}
