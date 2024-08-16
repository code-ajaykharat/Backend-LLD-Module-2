package com.design.patterns.flyweight;

public class TreeInstance {//Extrinsic data
    private int x;
    private int y;
    private TreeType treeType; //Hold the object of intrinsic data
    public TreeInstance(int x, int y, TreeType treeType){
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
    public void display() {
        treeType.display(x,y);
    }
}
