package org.example.Trial;

public class NumberPrinterThread implements Runnable{
    String threadName;
    public NumberPrinterThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println(this.threadName + "---> "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new NumberPrinterThread("Thread-1"));
        Thread t2 = new Thread(new NumberPrinterThread("Thread-2"));
        Thread t3 = new Thread(new NumberPrinterThread("Thread-3"));


        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }


}
