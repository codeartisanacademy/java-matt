package com.company;

public class SwitchControl {
    public static void main(String[] args) {
        String order = "nasi goreng";

        switch(order){
            case "burger":
                System.out.println("You ordered burger");
                break;
            case "hot dog":
                System.out.println("You ordered hot");
                break;
            case "pasta":
                System.out.println("You ordered pasta");
                break;
            default:
                System.out.println("You haven't ordered anything or we dont have what you want");
                break;

        }
    }
}
