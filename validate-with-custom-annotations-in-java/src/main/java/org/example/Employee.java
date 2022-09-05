package org.example;



public class Employee {

    private String id;
    private String name;
    private int age;

    @NotEmpty
    @MinLength(3)
    @MaxLength(10)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotEmpty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Min(18)
    @Max(120)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

}