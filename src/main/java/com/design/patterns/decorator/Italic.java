package com.design.patterns.decorator;

public class Italic extends TextDecorator{
    public Italic(Text txt) {
        super(txt);
    }

    @Override
    public String display() {
        return "<i>"+txt.display()+"</i>";
    }
}
