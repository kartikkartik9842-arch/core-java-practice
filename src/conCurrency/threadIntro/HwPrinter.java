package conCurrency.threadIntro;

public class HwPrinter implements  Runnable{

    @Override
    public void run() {
        // This method runs on the new thread.
        System.out.println("HwPrinter run" +  Thread.currentThread().getName());
    }

}
