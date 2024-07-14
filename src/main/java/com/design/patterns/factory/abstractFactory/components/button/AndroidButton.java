package com.design.patterns.factory.abstractFactory.components.button;

public class AndroidButton implements Button{
    @Override
    public void display() {
        System.out.println("I am android button");
    }
}
