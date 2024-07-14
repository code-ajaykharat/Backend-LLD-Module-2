package com.design.patterns.factory.factoryMethod;

import com.design.patterns.factory.Student;
import com.design.patterns.factory.User;

public class StudentFactory implements UserFactory {
    @Override
    public User createUser(int id, String name) {
        return new Student(id,name);
    }
}
