package com.design.abstraction;

public class Main {
    public static void main(String[] args) {
        Text p = new PlainText("My name is Ajay");
        System.out.println(p.display());
        p = new Bold(p);
        System.out.println(p.display());
    }
}
