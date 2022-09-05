package org.example;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    static {
        System.out.println("This is first static block");
    }

    public static String staticString = "Static Variable";

    static {
        System.out.println("This is second static block and " + staticString);
    }

    static {
        staticMethod();
        System.out.println("This is third static block");
    }

    private static void staticMethod() {
        System.out.println("This is static method");
    }

    private static void staticMethod2() {
        System.out.println("This is static method2");
    }

    private static int a;
    private static List<String> names;

    static {
        names = new ArrayList<String>();
        names.add("Name 1");
        names.add("Name 2");
        names.add("Name 3");
        names.add("Name 4");
    }

    private static void display() {
        System.out.println("a: " + a);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.staticMethod2();
        Demo.display();
    }

}
