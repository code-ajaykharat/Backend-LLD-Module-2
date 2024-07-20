package com.design.patterns.decorator;

public class PlainText implements Text{
    public String str;
    public PlainText(String str){
        this.str = str;
    }
    public String display(){
        return str;
    }
}
