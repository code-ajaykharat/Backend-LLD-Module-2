package com.design.patterns.factory.simpleFactory;

import com.design.patterns.factory.Student;
import com.design.patterns.factory.Teacher;
import com.design.patterns.factory.User;

public class UserFactory {
    public static User createUser(UserRole role){
        switch (role){
            case STUDENT: return new Student(1,"Ajay");
            case TEACHER: return new Teacher(1,"Bhim");
        }
        return null;
    }
}
