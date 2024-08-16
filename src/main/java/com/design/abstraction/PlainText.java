package com.design.abstraction;

public class PlainText implements Text{
    private String txt;
    public PlainText(String txt){
        this.txt = txt;
    }
    @Override
    public String display() {
        return this.txt;
    }
}
