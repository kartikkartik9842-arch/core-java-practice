package conCurrency.producerConsumerIntro;

import java.util.Queue;

public class Consumer implements  Runnable{

    Queue<Object> store;

    public Consumer(Queue<Object> store){
        this.store = store;
    }


    @Override
    public void run() {
        synchronized (store){
            while(true){
                if(!store.isEmpty()){
                    store.remove();
                }
            }
        }


    }
}
