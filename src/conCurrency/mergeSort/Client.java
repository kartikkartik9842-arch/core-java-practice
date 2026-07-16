package conCurrency.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> sortedFutureArray = executorService.submit(mergeSorter);

        // Wait until the sorting is completed.
        System.out.println(sortedFutureArray.get());
        executorService.shutdown();
    }
}