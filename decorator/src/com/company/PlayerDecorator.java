package com.company;

public abstract class PlayerDecorator implements Player  {
    public Player p;

    public PlayerDecorator(Player p){
        this.p = p;
    }

    public void display(){
        p.display();
    }

}
