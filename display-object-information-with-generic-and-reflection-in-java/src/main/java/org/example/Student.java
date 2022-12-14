package org.example;

public class Student {

    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "Hello World";
    }

    public String hi(String message) {
        return "Hello " + message;
    }

    public double avg(double math, double physical, double chemistry) {
        return (math * 3 + physical * 2 + chemistry) / 6;
    }

}