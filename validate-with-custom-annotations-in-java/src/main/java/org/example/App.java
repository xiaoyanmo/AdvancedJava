package org.example;

import java.lang.reflect.Method;

/**
 * Hello world!
 */
public class App {
    public static boolean isValid(Employee employee) {
        boolean result = true;
        try {
            Class employeeClass = employee.getClass();
            for (Method method : employeeClass.getMethods()) {
                if (method.getName().startsWith("get") && !method.getName().equalsIgnoreCase("getClass")) {
                    if (method.isAnnotationPresent(NotEmpty.class)) {
                        String value = method.invoke(employee, new Object[]{}).toString();
                        if (value.isEmpty()) {
                            result = false;
                            break;
                        }
                    }
                    if (method.isAnnotationPresent(MinLength.class)) {
                        MinLength minLength = (MinLength) method.getAnnotation(MinLength.class);
                        String value = method.invoke(employee, new Object[]{}).toString();
                        if (value.length() < minLength.value()) {
                            result = false;
                            break;
                        }
                    }
                    if (method.isAnnotationPresent(MaxLength.class)) {
                        MaxLength maxLength = (MaxLength) method.getAnnotation(MaxLength.class);
                        String value = method.invoke(employee, new Object[]{}).toString();
                        if (value.length() > maxLength.value()) {
                            result = false;
                            break;
                        }
                    }
                    if (method.isAnnotationPresent(Min.class)) {
                        Min min = (Min) method.getAnnotation(Min.class);
                        int value = Integer.parseInt(method.invoke(employee, new Object[]{}).toString());
                        if (value < min.value()) {
                            result = false;
                            break;
                        }
                    }
                    if (method.isAnnotationPresent(Min.class)) {
                        Max max = (Max) method.getAnnotation(Max.class);
                        int value = Integer.parseInt(method.invoke(employee, new Object[]{}).toString());
                        if (value > max.value()) {
                            result = false;
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId("p01");
        employee.setName("Name 1");
        employee.setAge(2); // Invalid
        System.out.println("Valid: " + isValid(employee));

    }

}
