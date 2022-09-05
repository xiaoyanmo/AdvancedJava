package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Student Info");
        AbstractModel<Student> abstractModel1 = new AbstractModel<>(Student.class);
        abstractModel1.display();

        System.out.println("Product Info");
        AbstractModel<Product> abstractModel2 = new AbstractModel<Product>(Product.class);
        abstractModel2.display();
    }
}
