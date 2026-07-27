package conCurrency.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Shared queue used by all producers and consumers.

        Semaphore consumerSemaphore = new Semaphore(0);
        Semaphore producerSemaphore = new Semaphore(4);
        Queue<Object> store= new ConcurrentLinkedQueue();

        // Multiple producers remove objects from the queue.
        Producer p1= new Producer(store, consumerSemaphore, producerSemaphore);
        Producer p2= new Producer(store, consumerSemaphore, producerSemaphore);
        Producer p3= new Producer(store, consumerSemaphore, producerSemaphore);

        // Multiple consumers remove objects from the queue.
        Consumer c1= new Consumer(store,  consumerSemaphore, producerSemaphore);
        Consumer c2= new Consumer(store,  consumerSemaphore, producerSemaphore);
        Consumer c3= new Consumer(store,  consumerSemaphore, producerSemaphore);
        Consumer c4= new Consumer(store,  consumerSemaphore, producerSemaphore);

        Thread pt1= new  Thread(p1);
        Thread pt2= new  Thread(p2);
        Thread pt3= new  Thread(p3);

        Thread ct1= new Thread(c1);
        Thread ct2= new Thread(c2);
        Thread ct3= new Thread(c3);
        Thread ct4= new Thread(c4);

        pt1.start();
        pt2.start();
        pt3.start();
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();


    }
}

//Sync alone is not effecient here because we want multiple threads producer and consumers
//can enter the store but its not happening here .
//This means:
//        - Other producer threads have to wait.
//        - Other consumer threads also have to wait.
//
//As a result, concurrency decreases and CPU resources are not utilised efficiently.