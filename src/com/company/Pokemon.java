package com.company;

public class Pokemon {

    static final int MAX_HEALTH = 100;

    // instances variables / properties / data
    String name;
    int health;
    Move[] moves;

    public Pokemon(String _name, int _health, Move[] _moves){
        this.health = _health;
        this.name = _name;
        this.moves = _moves;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean hasFainted(){
        if(this.health<=0){
            return true;
        }
        return false;
    }

    public boolean canLearnMoreMoves(){
        if(this.moves.length < 4){
            return true;
        }
        return false;
    }

    public boolean learnMove(Move move){
        if(this.moves.length<4 ){
            // 3 moves, occupied index 0, 1, 2
            int totalMoves = this.moves.length;
            this.moves[totalMoves] = move;
            return true;
        }
        return false;
    }

    public void forgetMove(Move move){
        for(int x = 0; x<this.moves.length; x++){
            if(this.moves[x].equals(move)){
                this.moves[x] = null;
            }
        }
    }

    @Override
    public String toString() {
        return this.name + "( Health: " + this.health + "/" + MAX_HEALTH + ")";
    }
}
