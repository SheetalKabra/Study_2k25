package org.example.Trial;

class Counter{
    int count = 0;
    synchronized void increament(){
        count++;
    }
}
public class MultiThreadingSynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                System.out.println("t1:"+counter.count);
                counter.increament();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                System.out.println("t2:"+counter.count);
                counter.increament();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter=====:"+counter.count);
    }
}
