package org.example;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
/**
 * Hello world!
 */
public class App {
    private static void displayConstructors(Student student) {
        Class studentClass = student.getClass();
        for (Constructor constructor : studentClass.getConstructors()) {
            System.out.println(constructor.getName());
            System.out.println("\tParameter Count: " + constructor.getParameterCount());
            if (constructor.getParameterCount() > 0) {
                for (Parameter parameter : constructor.getParameters()) {
                    System.out.println("\t" + parameter.getName() + ": " + parameter.getType());
                }
            }
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        displayConstructors(student);

    }
}
