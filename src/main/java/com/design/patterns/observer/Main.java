package com.design.patterns.observer;

import com.design.patterns.observer.batch.BatchA;
import com.design.patterns.observer.batch.BatchB;
import com.design.patterns.observer.batch.StudentBatch;
import com.design.patterns.observer.notification.NewIphone;

public class Main {
    public static void main(String[] args) {
        NewIphone ns = new NewIphone();
        StudentBatch sb1 = new BatchA(ns);
        StudentBatch sb2 = new BatchB(ns);


        ns.setNewIphoneVersion("Iphone 16");
        System.out.println("----------****-----------");
        ns.setNewIphoneVersion("Iphone 17");
    }
}
