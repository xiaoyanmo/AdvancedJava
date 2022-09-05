package org.example;

public class Child extends Parent{
    {
        System.out.println("Inside Child initialisation block");
    }

    public Child() {
        System.out.println("Inside constructor of Child");
    }
}
