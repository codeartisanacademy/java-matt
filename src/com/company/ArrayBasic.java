package com.company;

public class ArrayBasic {
    public static void main(String[] args) {
        // declare an array of integers with six items inside
        int[] numbers = new int[6];
        numbers[1] = 2;
        // access item inside array
        System.out.println(numbers[1]);

        //literal assignment
        int[] scores = {10, 30, 60, 40};

        System.out.println(scores.length);

        /**
        for(int x = 0; x < scores.length; x++ ){
            System.out.println(scores[x]);
        }
        */

        // for each loop
        for(int s: scores){
            System.out.println(s);
        }

        // multidimensional array = array inside array
        // int[][] grids = new int[2][3];
        int[][] grids = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(grids[0][1]);
    }


}
