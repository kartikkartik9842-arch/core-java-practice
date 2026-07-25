package conCurrency.syncBlock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        // Incrementing the shared variable.
        for(int i=0; i<100000; i++){
            synchronized (count){
                count.val++;
            }
        }
    }
}
