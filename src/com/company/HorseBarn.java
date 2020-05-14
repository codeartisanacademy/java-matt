package com.company;

class Horse{
    String name;
    int weight;

    String getName(){
        return name;
    };
    int getWeight(){
        return weight;
    }
}
public class HorseBarn {
    private Horse[] spaces;

    public int findHorseSpace(String name){
        for(int x = 0; x < spaces.length; x++){
            Horse h = spaces[x];
            if(h.getName() == name){
                return x;
            }
        }
        return -1;
    }

    public void consolidate(){
        int emptyBarnIndex = 0;
        int totalHorse = 0;
        for(int x = 0; x < spaces.length; x++){
            Horse h = spaces[x];
            if(h!=null){
                totalHorse += 1;
            }
        }

        Horse[] horses = new Horse[totalHorse];
        for(int x = 0; x < spaces.length; x++){
            horses[]
        }

    }

    public static void main(String[] args) {
        HorseBarn hb = new HorseBarn();
        hb.spaces = new Horse[5];
        hb.spaces[0] = new Horse();
        hb.spaces[3] = new Horse();
        hb.spaces[4] = new Horse();

        for(Horse h: hb.spaces){
            System.out.println(h);
        }

        hb.consolidate();
        System.out.println("consolidated: ");
        for(Horse h: hb.spaces){
            System.out.println(h);
        }

    }
}
