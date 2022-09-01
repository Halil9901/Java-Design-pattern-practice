package com.company;

public class ShirtDecorator extends PlayerDecorator{

    private String color;

    public ShirtDecorator(Player p, String c) {
        super(p);
        this.color = c;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("with a "+ color +  " shirt");
    }
}
