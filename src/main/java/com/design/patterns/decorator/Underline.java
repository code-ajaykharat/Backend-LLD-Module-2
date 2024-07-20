package com.design.patterns.decorator;

public class Underline extends TextDecorator{
    public Underline(Text txt) {
        super(txt);
    }

    @Override
    public String display() {
        return "<u>"+txt.display()+"/u";
    }
}
