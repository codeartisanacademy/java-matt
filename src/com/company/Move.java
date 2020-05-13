package com.company;

import java.util.Objects;

public class Move {
    // constant variable using static final
    static final int MAX_DAMAGE = 100;

    // data of the class Move
    String name;
    int damage;

    // constructor = a function that has same name as the class
    public Move(String _name, int _damage){
        this.name = _name;
        if(_damage > MAX_DAMAGE){
            this.damage = MAX_DAMAGE;
        }else{
            this.damage = _damage;
        }
    }

    // accessor method / getter method
    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    // mutator method / setter method
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.damage + " damage)";
    }

    public boolean equals(Move m) {
        if(m.name == this.name){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Move waterGun = new Move("Water Gun", 50);
        Move airGun = new Move("Air Gun", 150);
        System.out.println(airGun.toString());
        System.out.println(waterGun.getName() + " (" + waterGun.getDamage() + ")");
    }
}
