package com.design.patterns.prototypeRegistry;

public interface Document {
    Document clone();
    void setId(int id);
    void setName(String name);
}
