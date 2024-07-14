package com.design.patterns.factory.abstractFactory.components.dropdown;

public class IOSDropDown implements DropDown{
    @Override
    public void display() {
        System.out.println("I am ios dropdown");
    }
}
