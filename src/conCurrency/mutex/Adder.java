package conCurrency.mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Lock lock;


    private Count count;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        // Incrementing the shared variable.
        for(int i=0; i<100000; i++){
            lock.lock();
            System.out.println("Inside addder");
            count.val++;
            lock.unlock();
        }
    }
}
