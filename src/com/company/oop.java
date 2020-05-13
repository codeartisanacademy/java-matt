package com.company;


class Student{
    public Student(){
        System.out.println("Object creation");
    }

    // instance variable
    String firstName;
    String major;
    boolean enrolled;

}

public class oop {
    public static void main(String[] args) {
        Student john = new Student();
        Student jane = new Student();
        System.out.println(john);
        System.out.println(jane);

        john.firstName = "John";
        john.major = "Politic";
        john.enrolled = false;

    }
}

