package com.example;

import java.lang.reflect.Modifier;

public class App {
    private static void displayClassInfo(Student student) {
        Class studentClass = student.getClass();
        System.out.println("Name: " + studentClass.getName());
        System.out.println("Package Name: " + studentClass.getPackage().getName());
        System.out.println("Modifier: " + Modifier.toString(studentClass.getModifiers()));
    }

    public static void main(String[] args) {

        Student student = new Student();
        displayClassInfo(student);

    }
}
