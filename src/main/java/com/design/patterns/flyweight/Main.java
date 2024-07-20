package com.design.patterns.flyweight;

public class Main {
    public static void main(String[] args) {

        Forest forest = new Forest();
        forest.plantTree("Coconut","green",5,7);
        forest.plantTree("Babul","orange",4,9);
        forest.plantTree("Babul","orange",3,6);
        forest.plantTree("Bamboo","yellow",2,4);
        forest.plantTree("Coconut","green",5,4);

        forest.displayForest();
    }
}
