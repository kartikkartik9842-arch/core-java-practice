package conCurrency.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Queue<Object> store;
    Semaphore consumerSemaphore;
    Semaphore producerSemaphore;

    public Producer(Queue<Object> store, Semaphore consumerSemaphore, Semaphore producerSemaphore){
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                // Wait until an empty slot is available.
                producerSemaphore.acquire();
                store.add(new Object());
                System.out.println("produced");
                // Signal that one more item is available
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
