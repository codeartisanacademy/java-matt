package com.company;

import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers;
    private String name;

    public double getScore(ArrayList<String> key){
        double totalScore = 0;

        for(int x = 0; x < key.size(); x++){
            if(answers.get(x) == key.get(x)){
                totalScore = totalScore + 1;
            }else if(answers.get(x)=="?"){
                totalScore = totalScore + 0;
            }else if(answers.get(x) != key.get(x)){
                totalScore = totalScore - 0.25;
            }
        }

        return totalScore;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {

    }
}
