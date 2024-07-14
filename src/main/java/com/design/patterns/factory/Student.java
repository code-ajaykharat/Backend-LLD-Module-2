package com.design.patterns.factory;

public class Student extends User{
    public Student(){}
    public Student(int id, String name){
        super(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
