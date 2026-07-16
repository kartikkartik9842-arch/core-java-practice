package conCurrency.executorExample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        // Creates a pool of 10 worker threads.
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {
            Numberprinter numberprinter = new Numberprinter(i);
            // Instead of creating a new thread every time,
            // the task is given to the thread pool.
            executorService.execute(numberprinter);
        }
        executorService.shutdown();
    }
}