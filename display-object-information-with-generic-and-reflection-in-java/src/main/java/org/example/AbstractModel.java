package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AbstractModel<T extends Object> {

    private Class<T> entityClass;

    public AbstractModel(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void display() {

        System.out.println("Class Info");
        System.out.println("\tClass Name: " + entityClass.getSimpleName());
        System.out.println("\tPackage Name: " + entityClass.getPackage().getName());
        System.out.println("\tModifier: " + Modifier.toString(entityClass.getModifiers()));

        System.out.println("Declared Fields");
        for (Field field : entityClass.getDeclaredFields()) {
            System.out.println("\tField Name: " + field.getName());
            System.out.println("\tField Type: " + field.getType().getName());
            System.out.println("\t==================================");
        }

        System.out.println("Declared Methods");
        for (Method method : entityClass.getDeclaredMethods()) {
            System.out.println("\tMethod Name: " + method.getName());
            System.out.println("\tMethod Type: " + method.getReturnType().getName());
            System.out.println("\t==================================");
        }
    }

}