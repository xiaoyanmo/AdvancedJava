package org.example;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/**
 * Hello world!
 */
public class App {
    private static void displayAllAnnotations(Student student) {
        Class studentClass = student.getClass();
        for (Method method : studentClass.getDeclaredMethods()) {
            System.out.println("Method Name: " + method.getName());
            Annotation[] annotations = method.getAnnotations();
            System.out.println("Count Annotations: " + annotations.length);
            if (annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    System.out.println("\tAnnotation Name: " + annotation.annotationType().getName());
                    System.out.println("\tAnnotation Simple Name: " + annotation.annotationType().getSimpleName());
                    System.out.println("\tAnnotation Modifier: " + Modifier.toString(annotation.annotationType().getModifiers()));
                }
            }
            System.out.println("========================================================================");
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        displayAllAnnotations(student);

    }
}
