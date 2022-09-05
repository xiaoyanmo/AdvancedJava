package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Hello world!
 */
public class App {
    private static void displayAllDeclaredFields(Student student) {
        Class studentClass = student.getClass();
        Field[] declaredFields = studentClass.getDeclaredFields();
        System.out.println("Count Declared Fields: " + declaredFields.length);
        for (Field field : declaredFields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().getName());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("============================");
        }
    }


    public static void main(String[] args) {

        Student student = new Student();
        displayAllDeclaredFields(student);

    }
}
