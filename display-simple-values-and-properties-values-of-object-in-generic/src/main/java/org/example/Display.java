package org.example;


import java.lang.reflect.Field;

public class Display<T> {

    private T t;

    public Display(T t) {
        this.t = t;
    }

    public void show() {
        if (this.t instanceof Integer || this.t instanceof Double || this.t instanceof String
                || this.t instanceof Boolean) {
            System.out.println(this.t);
        } else {
            try {
                Class classObject = this.t.getClass();
                System.out.println(classObject.getSimpleName() + " Info");
                for (Field field : classObject.getDeclaredFields()) {
                    System.out.println("Field Name: " + field.getName());
                    field.setAccessible(true);
                    System.out.println("Field Value: " + field.get(this.t));
                    System.out.println("===========================");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}