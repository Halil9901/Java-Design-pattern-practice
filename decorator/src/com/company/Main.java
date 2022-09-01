package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player m = new Male();
        Player f = new Female();



        PlayerDecorator p1 = new ShirtDecorator( new SkirtDecorator(f),"Blue" );
        PlayerDecorator p2 = new ShirtDecorator( new SkirtDecorator(m), "Red" );

        p1.display();
        p2.display();
    }
}
