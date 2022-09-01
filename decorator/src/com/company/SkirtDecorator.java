package com.company;

public class SkirtDecorator extends PlayerDecorator{
    public SkirtDecorator(Player p) {
        super(p);
    }

    @Override
    public void display() {
        super.display();
        if(p instanceof Female){
            System.out.println("With a skirt");
        }
    }
}
