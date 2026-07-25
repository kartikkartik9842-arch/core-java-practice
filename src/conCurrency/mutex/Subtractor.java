package conCurrency.mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    private Lock lock;
    private Count count;
    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        // Decrementing the shared variable.
        for(int i=0; i<100000; i++){
            lock.lock();
            System.out.println("Inside Subtractor");
            count.val--;
            lock.unlock();
        }
    }

}
