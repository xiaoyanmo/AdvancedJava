package org.example;

public class Parent {
    private String name;

    {
        System.out.println("Inside Parent initialisation block");
    }

    public Parent() {
        System.out.println("Inside Parent constructor");
    }


}
