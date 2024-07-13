package com.design.patterns.prototypeRegistry;

public class Report implements Document{
    int id;
    String name;
    public Report(int id, String name){
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
    public Report clone() {
        return new Report(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
