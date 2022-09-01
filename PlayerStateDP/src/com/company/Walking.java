package com.company;

public class Walking extends PlayerState{
    @Override
    public void Moveable(Player player) {
        System.out.println("This player is walking");
        player.setState(this);

    }
    public String toString(){
        return "Walking";
    }
}
