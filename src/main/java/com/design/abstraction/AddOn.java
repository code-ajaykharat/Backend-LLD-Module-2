package com.design.abstraction;

public abstract class AddOn implements Text{
    public Text txt;
    public AddOn(Text txt){
        this.txt = txt;
    }
}
