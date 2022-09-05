package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelTasksReturnResults {

    private static ExecutorService threadLauncher = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private List<Callable<Object>> callableList = new ArrayList<Callable<Object>>();

    public void addCallable(Callable<Object> callable) {
        this.callableList.add(callable);
    }

    public void clearCallables() {
        this.callableList.clear();
    }

    public void executeThreads() {
        try {
            threadLauncher.invokeAll(this.callableList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object[] getResult() {
        List<Future<Object>> resultList = null;
        Object[] resultArray = null;
        try {
            resultList = threadLauncher.invokeAll(this.callableList);
            resultArray = new Object[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultArray[i] = resultList.get(i).get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultArray;
    }

}