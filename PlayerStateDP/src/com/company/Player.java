package com.company;

public class Player {
    private PlayerState s;

    public void Context(){
        s = null;
    }

    public void setState(PlayerState s){
        this.s = s;
    }

    public PlayerState getState(){
        return s;
    }



}
