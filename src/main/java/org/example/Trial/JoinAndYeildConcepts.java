package org.example.Trial;

import java.util.ArrayList;

public class JoinAndYeildConcepts {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for(int i=0; i<5; i++){
                System.out.println("T1 running...");
            }
        });
        t1.join();

        Thread t2 = new Thread(() -> {
            for(int i=0; i<5; i++){
                System.out.println("T2 running...");
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i=0; i<5; i++){
                System.out.println("T3 running...");
                Thread.yield();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }


}
