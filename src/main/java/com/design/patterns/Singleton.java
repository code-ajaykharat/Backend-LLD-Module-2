package com.design.patterns;

public class Singleton {
    //class level ref. var to store object
    private static volatile Singleton instance = null;

    private int count = 0;
    //no new instance
    private Singleton(int count){
       this.count = count;
    }

    //global access point for one instance
    public static Singleton getInstance(int count){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton(count);
                }
            }
        }
        return instance;
    }

    public int getCount(){
        return this.count;
    }
}
