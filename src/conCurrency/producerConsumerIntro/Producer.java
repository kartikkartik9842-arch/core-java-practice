package conCurrency.producerConsumerIntro;

import java.util.Queue;

public class Producer implements Runnable{

    Queue<Object> store;

    private int MAX_SIZE=5;

    public Producer(Queue<Object> store){
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store){
            while (true){
                if(store.size()<MAX_SIZE){
                    store.add(new Object());
                }
            }
        }

    }
}
