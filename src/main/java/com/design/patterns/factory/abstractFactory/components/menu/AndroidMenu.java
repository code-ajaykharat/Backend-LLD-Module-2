package com.design.patterns.factory.abstractFactory.components.menu;

public class AndroidMenu implements Menu{
    @Override
    public void display() {
        System.out.println("I am android menu");
    }
}
