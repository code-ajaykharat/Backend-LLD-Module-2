package com.design.mock;

import java.util.concurrent.Semaphore;

public class Operation {

    private int x;
    private int n;
    private Semaphore t1 = new Semaphore(1);
    private Semaphore t2 = new Semaphore(0);
    private Semaphore t3 = new Semaphore(0);
    public Operation(int n){
        this.n = n;
        x = 1;
    }

    //thread - 1 will execute it
    public void printThread1() throws InterruptedException {
        while(x<=n){
            t1.acquire();
            if(x<=n) System.out.println(Thread.currentThread().getName()+" :" +x);
            x++;
            t2.release();
        }
    }
    //thread - 2 will execute it
    public void printThread2() throws InterruptedException {
        while(x<=n) {
            t2.acquire();
            if(x<=n) System.out.println(Thread.currentThread().getName()+" :"+x);
            x++;
            t3.release();
        }
    }
    //thread - 3 will execute it
    public void printThread3() throws InterruptedException {
        while(x<=n) {
            t3.acquire();
            if(x<=n) System.out.println(Thread.currentThread().getName()+" :"+x);
            x++;
            t1.release();
        }
    }
}
