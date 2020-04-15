package com.company;

public class FunctionBasic {
    public static void sayHello(){
        System.out.println("Hello there");
    }
    // public is an accessor, void = doesn't give any return
    public static void greetSomeone(String name, String salutation){
        System.out.println("Hello " + salutation + " " + name);
    }

    // dealing price and division, use double
    private static double getFinalPrice(double discount, double price){
        double finalPrice = 0;
        finalPrice = price - (price*(discount/100));
        System.out.println(finalPrice);
        return finalPrice;
    }

    // method overload = a same name but different signatures
    private static double getFinalPrice(double discount, double price, double extraDiscount){
        double finalPrice = 0;
        finalPrice = price - (price*(discount/100)) - (price*(extraDiscount/100));
        return finalPrice;
    }


    public static void main(String[] args) {
        sayHello();
        greetSomeone("John", "Mr.");
        double finalPrice = getFinalPrice(10, 1000);
        double cheaperPrice = getFinalPrice(10, 1000, 10);
        System.out.println(finalPrice);
        System.out.println(cheaperPrice);
    }
}
