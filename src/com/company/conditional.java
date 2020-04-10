package com.company;

public class conditional {
    public static void main(String[] args) {
        int age = 13;
        if(age > 16){
            System.out.println("age is older than 16");
        }
        else if (age < 16){
            System.out.println("age is younger than 16");
        }else{
            System.out.println("age is 16");
        }

        // comparrisson ==, >=, <=, !=
        System.out.println(age!=16);

        String username = "";

        // combination of conditions && ||
        if(username.length() > 0  && username == "john"){
            System.out.println("username is correct");
        }else{
            System.out.println("Try again");
        }

    }
}
