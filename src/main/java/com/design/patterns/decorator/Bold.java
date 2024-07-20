package com.design.patterns.decorator;

public class Bold extends TextDecorator{
    public Bold(Text txtt) {
        super(txtt);
    }

    @Override
    public String display() {
        return "<b>" + txt.display() + "</b>";
    }
}
