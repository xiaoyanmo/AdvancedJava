package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        try {
            List<Integer> a = new ArrayList<>();
            a.add(5);
            a.add(-2);
            a.add(11);
            a.add(20);
            a.add(-3);
            a.add(9);
            a.add(-4);

            ParallelTasksReturnResults parallelTasksReturnResults = new ParallelTasksReturnResults();

            Callable<Object> countPositiveNumbers = new Callable<Object>() {
                @Override
                public Integer call() {
                    int count = 0;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) > 0) {
                            count++;
                        }
                    }
                    return count;
                }
            };

            Callable<Object> countNegativeNumbers = new Callable<Object>() {
                @Override
                public Integer call() {
                    int count = 0;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) < 0) {
                            count++;
                        }
                    }
                    return count;
                }
            };

            Callable<Object> countEvenNumbers = new Callable<Object>() {
                @Override
                public Integer call() {
                    int count = 0;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) % 2 == 0) {
                            count++;
                        }
                    }
                    return count;
                }
            };

            Callable<Object> countOddNumbers = new Callable<Object>() {
                @Override
                public Integer call() {
                    int count = 0;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) % 2 != 0) {
                            count++;
                        }
                    }
                    return count;
                }
            };

            parallelTasksReturnResults.addCallable(countEvenNumbers);
            parallelTasksReturnResults.addCallable(countNegativeNumbers);
            parallelTasksReturnResults.addCallable(countOddNumbers);
            parallelTasksReturnResults.addCallable(countPositiveNumbers);

            Object[] objects = parallelTasksReturnResults.getResult();
            for (Object object : objects) {
                System.out.println(object);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
