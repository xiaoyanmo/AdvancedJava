package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Simple Values");
        Display<Integer> displayInteger = new Display<Integer>(123);
        displayInteger.show();

        Display<String> displayString = new Display<String>("ABC");
        displayString.show();

        Display<Double> displayDouble = new Display<Double>(5.6);
        displayDouble.show();

        Employee employee = new Employee("st01", "name 1", 20);
        Display<Employee> displayEmployee = new Display<Employee>(employee);
        displayEmployee.show();

        Product product = new Product("p01", "name 2", 4.5, 2);
        Display<Product> displayProduct = new Display<Product>(product);
        displayProduct.show();

    }
}
