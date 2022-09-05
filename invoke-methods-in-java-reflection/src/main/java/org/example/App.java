package org.example;

import java.lang.reflect.Method;


/**
 * Hello world!
 */
public class App {
    private static void InvokeSayMethod(Student student) {
        try {
            Class studentClass = student.getClass();
            Method sayMethod = studentClass.getMethod("say", new Class[]{});
            String result = sayMethod.invoke(student, new Object[]{}).toString();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void InvokeHiMethod(Student student) {
        try {
            Class studentClass = student.getClass();
            Method hiMethod = studentClass.getMethod("hi", new Class[]{String.class});
            String result = hiMethod.invoke(student, new Object[]{"Kevin"}).toString();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void InvokeAvgMethod(Student student) {
        try {
            Class studentClass = student.getClass();
            Method avgMethod = studentClass.getMethod("avg", new Class[]{double.class, double.class, double.class});
            double result = (double) avgMethod.invoke(student, new Object[]{7, 6, 10});
            System.out.println("Avg: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        InvokeSayMethod(student);
        InvokeHiMethod(student);
        InvokeAvgMethod(student);

    }
}
