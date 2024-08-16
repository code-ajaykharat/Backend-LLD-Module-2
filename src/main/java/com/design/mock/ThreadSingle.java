package com.design.mock;

public class ThreadSingle implements Runnable{
    private Operation op;
    private int threadId;
    public ThreadSingle(Operation op, int id){
        this.op = op;
        this.threadId = id;
    }
    @Override
    public void run() {
        try {
            if (threadId == 1) {
                op.printThread1();
            } else if (threadId == 2) {
                op.printThread2();
            } else {
                op.printThread3();
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
