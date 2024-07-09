package com.design;

import com.design.patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton onlyOne = Singleton.getInstance(11);

        System.out.println("First: "+onlyOne.getCount());
        Singleton two = Singleton.getInstance(22);
        System.out.println("Second: "+onlyOne.getCount());
    }
}