package com.company;

import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public String highestScoringStudent(ArrayList<String> key){
        StudentAnswerSheet studentAnswerSheet = null;
        double highestScore = 0;

        for(int x = 0; x < sheets.size(); x++){
            // get the student answer sheet one by one
            StudentAnswerSheet currentSheet = sheets.get(x);
            // get the score from the current iteration
            double currentScore = currentSheet.getScore(key);
            if(currentScore > highestScore){
                studentAnswerSheet = currentSheet;
            }
        }

        return studentAnswerSheet.getName();

    }
}
