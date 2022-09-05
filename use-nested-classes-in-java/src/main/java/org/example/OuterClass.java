package org.example;

public class OuterClass {
    private static int x = 10;
    public class NestedClass{
        void display(){
            System.out.println("x: " + x);
        }
    }
}
