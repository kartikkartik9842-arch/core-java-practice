package conCurrency.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Callable is used because this task returns a sorted list.
public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrToSort;

    ExecutorService executorService;

    public MergeSorter(List<Integer> arrToSort, ExecutorService executorService) {
        this.arrToSort = arrToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        // Base case: a list with 0 or 1 element is already sorted.
        if (arrToSort.size() <= 1) {
            return arrToSort;
        }
        int size = arrToSort.size();
        int mid = size / 2;

        // Split the list into two halves.
        List<Integer> leftArray = new ArrayList<Integer>();
        for (int i = 0; i < mid; i++) {
            leftArray.add(arrToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<Integer>();
        for (int i = mid; i < size; i++) {
            rightArray.add(arrToSort.get(i));
        }

        // Create separate sorting tasks for both halves.
        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        // Submit both tasks to the thread pool.
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);

        int i = 0;
        int j = 0;

        // Wait until both halves are sorted.
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        // Merge the two sorted halves.
        List<Integer> sortedArray = new ArrayList<>();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}