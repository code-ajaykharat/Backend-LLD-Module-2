package com.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeRegistry {
    static Map<String, TreeType> hm = new HashMap<>();

    public static TreeType getTree(String name, String color){
        String key = name + "-" + color;
        TreeType treeType = hm.get(key);
        if(treeType == null){
            treeType = new TreeType(name, color);
            hm.put(key, treeType);
        }
        return treeType;
    }
}
