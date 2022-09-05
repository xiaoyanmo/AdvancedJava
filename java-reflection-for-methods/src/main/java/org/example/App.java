package org.example;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * Hello world!
 */
public class App {
    private static void displayAllMethods(Student student) {
        Class studentClass = student.getClass();
        Method[] methods = studentClass.getMethods();
        System.out.println("Count Methods: " + methods.length);
        System.out.println("Methods List");
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Method Return Type: " + method.getReturnType().getName());
            System.out.println("Method Modifier: " + Modifier.toString(method.getModifiers()));
            System.out.println("Count Parameter: " + method.getParameterCount());
            if (method.getParameterCount() > 0) {
                for (Parameter parameter : method.getParameters()) {
                    System.out.println("\t" + parameter.getName() + ": " + parameter.getType());
                }
            }
            System.out.println("=======================================");
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        displayAllMethods(student);

    }
}
