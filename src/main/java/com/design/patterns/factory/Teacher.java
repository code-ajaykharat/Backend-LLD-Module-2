package com.design.patterns.factory;

public class Teacher extends User{
    public Teacher(){}
    public Teacher(int id, String name){
        super(id,name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
