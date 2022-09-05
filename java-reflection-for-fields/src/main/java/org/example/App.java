package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Hello world!
 */
public class App {


    private static void displayAllFields(Student student) {
        Class studentClass = student.getClass();
        Field[] fields = studentClass.getFields();
        System.out.println("Count Fields: " + fields.length);
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().getName());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("============================");
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        displayAllFields(student);


    }
}
