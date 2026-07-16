package conCurrency.executorExample;

public class Numberprinter implements Runnable {

    private int i;

    public Numberprinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        // This task will be picked up by one of the threads in the pool.
        System.out.println("Numberprinter run " + this.i + " " + Thread.currentThread().getName());
    }
}