package conCurrency.threadIntro;

public class Client {
    public static void main(String[] args) {
        // This is the main thread.
        System.out.println("I am " + Thread.currentThread().getName());

        // The actual work to be done by the new thread.
        HwPrinter hwPrinter = new HwPrinter();

        // Creating a thread and passing the task.
        Thread thread = new Thread(hwPrinter);

        // Starts a new thread.
        thread.start();
        // A thread can be started only once thread.start();
        System.out.println("I am exiting " + Thread.currentThread().getName());
    }
}