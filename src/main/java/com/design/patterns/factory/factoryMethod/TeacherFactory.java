package com.design.patterns.factory.factoryMethod;

import com.design.patterns.factory.Teacher;
import com.design.patterns.factory.User;

public class TeacherFactory implements UserFactory{

    @Override
    public User createUser(int id, String name) {
        return new Teacher(id, name);
    }
}
