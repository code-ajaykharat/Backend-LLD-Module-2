package com.design.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Text p = new PlainText("My name is Ajay");//basic behaviour
        System.out.println(p.display());
        p = new Bold(p);//wrapped basic into bold
        System.out.println(p.display());
        p = new Italic(p);
        System.out.println(p.display());
        p = new Underline(p);
        System.out.println(p.display());

    }
}
