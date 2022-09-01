package com.company;

public class Running extends PlayerState{
    @Override
    public void Moveable(Player player) {
        System.out.println("This player is Running");
        player.setState(this);

    }
    public String toString(){
        return "Running";
    }
}
