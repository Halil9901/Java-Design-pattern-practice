package com.company;

public class OvenTemp implements Oven{
    private double temp; // temp in C

    public OvenTemp(double c){ this.temp = c;}

    @Override
    public double getValue() {
        return this.temp;
    }
}
