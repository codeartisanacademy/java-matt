package com.company;

public class StringBasic {
    public static void main(String[] args) {
        String email = "John.doe@gmail.com";

        String firstLetter = Character.toString(email.charAt(0));
        System.out.println(firstLetter);

        // substring takes a part of your string
        System.out.println(email.substring(5,10));

        // method overload = a method has different kind of signatures
        // indexOf returns the first occurrances of string i look for
        System.out.println(email.indexOf("@"));

        System.out.println(email.indexOf(".", email.indexOf("@")));

        // chain of methods
        System.out.println(email.toLowerCase().contains("j"));

        System.out.println("     hello     ".strip());

        System.out.println(email.length());

    }
}
