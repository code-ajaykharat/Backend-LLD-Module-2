package com.design.patterns.factory.abstractFactory.components.button;

public class IOSButton implements Button{
    @Override
    public void display() {
        System.out.println("I am ios button");
    }
}
