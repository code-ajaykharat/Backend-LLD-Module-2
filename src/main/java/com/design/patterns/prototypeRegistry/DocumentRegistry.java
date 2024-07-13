package com.design.patterns.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private Map<String, Document> map = new HashMap<>();
    public void register(String name, Document doc){
        map.put(name, doc);
    }

    public Document get(String name){
        Document doc = map.get(name);
        return doc!=null? doc.clone():null;
    }
}
