package com.design.patterns.factory.factoryMethod;

import com.design.patterns.factory.User;

public class ClientFactoryMethod {
    public static void main(String[] args) {
        UserFactory factory = new StudentFactory();
        //we are not known about the class name of student, factory is giving us the object of student
        User student = factory.createUser(100,"Ajay");
        System.out.println(student);


    }
}
