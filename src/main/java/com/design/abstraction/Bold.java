package com.design.abstraction;

public class Bold extends AddOn{
    public Bold(Text txt){
        super(txt);
    }

    @Override
    public String display() {
        return "<b>" + txt.display() + "</b>";
    }
}
