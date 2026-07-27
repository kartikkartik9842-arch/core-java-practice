package conCurrency.syncBlock;

public class Count {
    // Shared resource accessed by multiple threads
    private int val;

    public synchronized void incrVal(int x) {
        val+=x;
    }

//    public synchronized void decrVal(int x) {
//        val-=x;
//    }

    public  int getVal() {
        return val;
    }
}

//A synchronized method allows only one thread at a time to execute that method
// for the same object.
//Other threads must wait until the current thread exits the synchronized method.
//if a thread executing one sync method for that tie other threads cant even other
//sync method of that class

//When a thread enters a synchronized instance method, it acquires the lock of that object.
//The lock is released automatically when the method finishes.

//Only incrVal() modifies the shared variable.
//Since getVal() is called after both threads have finished (using join()),
// it does not need synchronization in this example.


//T1	T2	Will it run in parallel?
//c1.incVal()	c1.incVal()	❌ No
//c1.incVal()	c1.decrVal()	❌ No
//c1.incVal()	c1.getVal() (non-synchronized)	✅ Yes
//c1.incVal()	c2.incVal()	✅ Yes
