package conCurrency.threadsOneToHundred;

public class Client {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Creating a new thread for every number.
            Numberprinter numberprinter = new Numberprinter(i);
            Thread thread = new Thread(numberprinter);
            thread.start();
        }
    }
}