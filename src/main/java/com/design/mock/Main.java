package com.design.mock;

public class Main {
    public static void main(String[] args) {
//        Write a Java program to print a sequence of numbers upto 10 using 3 threads.
//        all threads should run simultaneously
//        For example, if we want to print a sequence of numbers upto 10 then it’ll look like this:
//
//        THREAD-1 : 1
//        THREAD-2 : 2
//        THREAD-3 : 3
//        THREAD-1 : 4
//        THREAD-2 : 5
//        THREAD-3 : 6
//        THREAD-1 : 7
//        THREAD-2 : 8
//        THREAD-3 : 9
//        THREAD-1 : 10
        Operation op = new Operation(10);
        //3 threads which will take same obj
        Thread t1 = new Thread(new ThreadSingle(op,1),"THREAD-1");
        Thread t2 = new Thread(new ThreadSingle(op,2),"THREAD-2");
        Thread t3 = new Thread(new ThreadSingle(op,3),"THREAD-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
