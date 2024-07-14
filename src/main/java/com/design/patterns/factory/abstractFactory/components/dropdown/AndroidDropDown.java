package com.design.patterns.factory.abstractFactory.components.dropdown;

public class AndroidDropDown implements DropDown{
    @Override
    public void display() {
        System.out.println("I am android dropdown");
    }
}
