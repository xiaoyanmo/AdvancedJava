package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Hello world!
 */
public class App {
    private static void displayAnnotationsOfClass(Account account) {
        Class accountClass = account.getClass();
        Annotation[] annotations = accountClass.getAnnotations();
        System.out.println("\tCount Annotations: " + annotations.length);
        if (annotations.length > 0) {
            for (Annotation annotation : annotations) {
                System.out.println("\tAnnotation Name: " + annotation.annotationType().getName());
                System.out.println("\tAnnotation Simple Name: " + annotation.annotationType().getSimpleName());
                System.out.println("\tAnnotation Modifier: " + Modifier.toString(annotation.annotationType().getModifiers()));
            }
        }
        System.out.println("------------------------------------------------------------");

    }

    private static void displayAnnotationsOfMethods(Account account) {
        Class accountClass = account.getClass();
        for (Method method : accountClass.getDeclaredMethods()) {
            System.out.println("\tMethod Name: " + method.getName());
            Annotation[] annotations = method.getAnnotations();
            System.out.println("\tCount Annotations: " + annotations.length);
            if (annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    System.out.println("\tAnnotation Name: " + annotation.annotationType().getName());
                    System.out.println("\tAnnotation Simple Name: " + annotation.annotationType().getSimpleName());
                    System.out.println("\tAnnotation Modifier: " + Modifier.toString(annotation.annotationType().getModifiers()));
                }
            }
            System.out.println("------------------------------------------------------------");
        }
    }

    private static void displayAnnotationsOfFields(Account account) {
        Class accountClass = account.getClass();
        for (Field field : accountClass.getDeclaredFields()) {
            System.out.println("\tField Name: " + field.getName());
            Annotation[] annotations = field.getAnnotations();
            System.out.println("\tCount Annotations: " + annotations.length);
            if (annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    System.out.println("\tAnnotation Name: " + annotation.annotationType().getName());
                    System.out.println("\tAnnotation Simple Name: " + annotation.annotationType().getSimpleName());
                    System.out.println("\tAnnotation Modifier: " + Modifier.toString(annotation.annotationType().getModifiers()));
                }
            }
            System.out.println("------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {

        Account account = new Account();

        System.out.println("Annotations of Class");
        displayAnnotationsOfClass(account);

        System.out.println("Annotations of Fields");
        displayAnnotationsOfFields(account);

        System.out.println("Annotations of Methods");
        displayAnnotationsOfMethods(account);

    }
}
