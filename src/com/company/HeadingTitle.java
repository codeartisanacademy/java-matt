package com.company;

public class HeadingTitle {

    static String toTitle(String text){
        // split => ['hello', 'from', 'java']
        String[] words = text.split(" ");
        String finalText = "";

        for(int x = 0; x<words.length; x++ ){
            char firstLetter = words[x].charAt(0);
            String finalWord = Character.toString(firstLetter).toUpperCase() + words[x].substring(1);
            finalText += finalWord + " ";
        }

        return finalText;
    }

    public static void main(String[] args) {
        String heading = "indonesia recovering from covid-19";

        String properHeading = toTitle(heading);

        System.out.println(properHeading);
    }
}
