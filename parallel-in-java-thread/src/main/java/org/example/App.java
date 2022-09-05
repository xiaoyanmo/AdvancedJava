package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

        try {
            List<Integer> a = new ArrayList<Integer>();
            a.add(5);
            a.add(-2);
            a.add(11);
            a.add(20);
            a.add(-3);
            a.add(9);
            a.add(-4);
            ParallelTasks tasks = new ParallelTasks();
            final Runnable countPositiveNumbers = new Runnable() {
                public void run() {
                    try {
                        int count = 0;
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i) > 0) {
                                count++;
                            }
                        }
                        System.out.println("Count Positive Numbers: " + count);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }
            };
            final Runnable countNegativeNumbers = new Runnable() {
                public void run() {
                    try {
                        int count = 0;
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i) < 0) {
                                count++;
                            }
                        }
                        System.out.println("Count Negative Numbers: " + count);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }
            };
            final Runnable countEvenNumbers = new Runnable() {
                public void run() {
                    try {
                        int count = 0;
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i) % 2 == 0) {
                                count++;
                            }
                        }
                        System.out.println("Count Even Numbers: " + count);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }
            };
            final Runnable countOddNumbers = new Runnable() {
                public void run() {
                    try {
                        int count = 0;
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i) % 2 != 0) {
                                count++;
                            }
                        }
                        System.out.println("Count Odd Numbers: " + count);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }
            };
            tasks.add(countEvenNumbers);
            tasks.add(countOddNumbers);
            tasks.add(countPositiveNumbers);
            tasks.add(countNegativeNumbers);
            tasks.go();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
