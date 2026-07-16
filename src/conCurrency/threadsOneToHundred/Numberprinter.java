package conCurrency.threadsOneToHundred;

public class Numberprinter implements Runnable {

    private int i;

    public Numberprinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        // Each thread prints the number assigned to it.
        System.out.println("Numberprinter run " + this.i + " " + Thread.currentThread().getName());
    }
}
