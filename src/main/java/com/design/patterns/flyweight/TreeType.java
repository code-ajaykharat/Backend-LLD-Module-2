package com.design.patterns.flyweight;

public class TreeType {//intrinsic data
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display(int x, int y){
        System.out.println("Planting the tree: "+name+" at location: "+x+" "+y);
    }
}
