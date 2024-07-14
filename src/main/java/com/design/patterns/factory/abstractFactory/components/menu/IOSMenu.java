package com.design.patterns.factory.abstractFactory.components.menu;

public class IOSMenu implements Menu{
    @Override
    public void display() {
        System.out.println("I am ios menu");
    }
}
