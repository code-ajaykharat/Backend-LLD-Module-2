package com.design.patterns.factory.factoryMethod;

import com.design.patterns.factory.User;

public interface UserFactory {
    User createUser(int id, String name);
}
