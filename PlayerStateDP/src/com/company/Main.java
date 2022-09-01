package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player p = new Player();

        Walking walking = new Walking();
        walking.Moveable(p);

        //System.out.println(p.getState().toString());

        Running running = new Running();
        running.Moveable(p);

        //System.out.println(p.getState().toString());
    }
}
