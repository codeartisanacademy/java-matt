package com.company;

import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasic {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        // add an item
        numbersList.add(1);
        numbersList.add(10);
        numbersList.add(5);

        System.out.println(numbersList);
        // add an item with index number
        numbersList.add(1, 12);

        System.out.println(numbersList);

        // size()
        System.out.println(numbersList.size());

        // add elements of a list to another list addAll
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(20);

        myNumbers.addAll(numbersList);

        System.out.println(myNumbers);

        // initialise list using asList Arrays.asList new ArrayList<>(Arrays.asList("",""))
        ArrayList<String> friends = new ArrayList<String>(Arrays.asList("John", "Mike", "Jim"));

        System.out.println(friends);

        // get(index)
        System.out.println((friends.get(1)));

        // set(index, item) to change
        friends.set(0, "Jane");
        System.out.println(friends);

        // remove(index)
        friends.remove("Mike");
        System.out.println(friends);

        // removeAll()
        // friends.removeAll(friends);
        // System.out.println(friends);

        // loop through using for
        for(int i=0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }

        // loop through using forEach
        for(String friend: friends){
            System.out.println(friend);
        }

        // convert list to an array


        // friends jane, john, jim, mike, donny, eric
        // create the allFriends list
        // create the list with friends with j
    }
}
