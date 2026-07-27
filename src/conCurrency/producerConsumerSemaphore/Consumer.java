package conCurrency.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{

    Queue<Object> store;
    Semaphore consumerSemaphore;
    Semaphore producerSemaphore;

    public Consumer(Queue<Object> store, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                // Wait until an item is available.
                consumerSemaphore.acquire();
                store.remove();
                System.out.println("consumed");
                // Signal that one more empty slot is available.
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
