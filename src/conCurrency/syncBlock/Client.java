package conCurrency.syncBlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {


        // Both threads are working on the same Count object.
        Count count= new Count();
        Adder adder= new Adder(count);
        Subtractor subtractor= new Subtractor(count);
        Thread thread1= new Thread(adder);
        Thread thread2= new Thread(subtractor);
        thread1.start();
        thread2.start();

        //waiting for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println(count.val);

    }
}

/*Race Condition occurs when multiple threads access and modify the same shared resource
 at the same time, and the final result depends on the order in which the threads execute.
In the above example, both Adder and Subtractor are updating count.val simultaneously.
Since ++ and -- are not atomic operations, the final value may not be 0.*/


/*A shared resource is any object or variable that is accessed by multiple threads.
Example:
Count count = new Count();
Both Adder and Subtractor are using the same Count object.*/

/*A critical section is the part of the code where a shared resource is accessed or modified.
Example:
count.val++;
count.val--;
Only one thread should execute a critical section at a time.*/

/*Preemption is the process where the operating system pauses a running thread and gives the CPU to another thread.
The paused thread can resume execution later from where it stopped.*/
