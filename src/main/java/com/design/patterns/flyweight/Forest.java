package com.design.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<TreeInstance> trees = new ArrayList<>();

    public void plantTree(String name, String color, int x, int y){
        TreeType treeType = TreeRegistry.getTree(name, color);//if exist give the same obj else create new = memory saved
        TreeInstance t = new TreeInstance(x, y, treeType);
        trees.add(t);
    }

    public void displayForest(){
        for(TreeInstance tree : trees){
            tree.display();
        }
    }
}
