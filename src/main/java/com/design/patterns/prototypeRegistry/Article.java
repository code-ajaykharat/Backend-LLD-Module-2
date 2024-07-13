package com.design.patterns.prototypeRegistry;

public class Article implements Document{
    int id;
    String name;
    public Article(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Article clone() {
        return new Article(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
