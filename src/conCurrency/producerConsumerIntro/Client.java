package conCurrency.producerConsumerIntro;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Shared queue used by all producers and consumers.
        Queue<Object> store= new ConcurrentLinkedQueue();

        // Multiple producers remove objects from the queue.
        Producer p1= new Producer(store);
        Producer p2= new Producer(store);
        Producer p3= new Producer(store);

        // Multiple consumers remove objects from the queue.
        Consumer c1= new Consumer(store);
        Consumer c2= new Consumer(store);
        Consumer c3= new Consumer(store);
        Consumer c4= new Consumer(store);

        Thread pt1= new  Thread(p1);
        Thread pt2= new  Thread(p2);
        Thread pt3= new  Thread(p3);

        Thread ct1= new Thread(c1);
        Thread ct2= new Thread(c2);
        Thread ct3= new Thread(c3);
        Thread ct4= new Thread(c4);

    }
}

//Sync alone is not effecient here because we want multiple threads producer and consumers
//can enter the store but its not happening here .
//This means:
//        - Other producer threads have to wait.
//        - Other consumer threads also have to wait.
//
//As a result, concurrency decreases and CPU resources are not utilised efficiently.