package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Sum<Integer, Integer> sum1 = new Sum<Integer, Integer>(3, 5);
        System.out.println("Sum 1: " + sum1.sum());

        Sum<Double, Double> sum2 = new Sum<Double, Double>(2.6, 5.3);
        System.out.println("Sum 2: " + sum2.sum());

        Sum<Integer, Double> sum3 = new Sum<Integer, Double>(2, 5.3);
        System.out.println("Sum 3: " + sum3.sum());

        Sum<Double, Integer> sum4 = new Sum<Double, Integer>(2.6, 4);
        System.out.println("Sum 4: " + sum4.sum());

    }
}
