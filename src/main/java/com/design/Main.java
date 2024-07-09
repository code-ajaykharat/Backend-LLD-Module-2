package com.design;

import com.design.patterns.Singleton;
import com.design.patterns.Student;

public class Main {
    public static void main(String[] args) {
        //singleton
        Singleton onlyOne = Singleton.getInstance(11);

        System.out.println("First: "+onlyOne.getCount());
        Singleton two = Singleton.getInstance(22);
        System.out.println("Second: "+onlyOne.getCount());

        //builder
        Student s1 = Student.builder()
                .id(11)
                .name("Ajay")
                .build();

        System.out.println(s1);
    }
}