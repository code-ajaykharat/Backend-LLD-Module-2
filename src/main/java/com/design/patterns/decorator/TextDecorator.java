package com.design.patterns.decorator;

public abstract class TextDecorator implements Text{//1.inheritance
    public Text txt;//2.composition
    public TextDecorator(Text txt){
        this.txt = txt;
    }
}
