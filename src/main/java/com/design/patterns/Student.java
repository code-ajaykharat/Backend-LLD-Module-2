package com.design.patterns;

public class Student {
    private int id;
    private String name;

    //private constructor
    private Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    //create builder obj
    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;

        //setters
        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }

        //validation
        private void validate(){
            if(id<10){
                throw new RuntimeException("id is less than 10");
            }
        }
        //build student obj
        public Student build(){
            return new Student(this.id, this.name);
        }
    }
}
