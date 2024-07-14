package com.design.patterns.factory;

public abstract class User {
    int id;
    String name;

    User(){}
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
