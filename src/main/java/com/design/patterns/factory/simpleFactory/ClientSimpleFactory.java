package com.design.patterns.factory.simpleFactory;

import com.design.patterns.factory.User;

public class ClientSimpleFactory {
    public static void main(String[] args) {
        User student = UserFactory.createUser(UserRole.STUDENT);
        System.out.println(student);
        User teacher = UserFactory.createUser(UserRole.TEACHER);
        System.out.println(teacher);
    }
}
