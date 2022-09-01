package com.company;

public class OvenTempAdapter implements OvenAdapter{
    public Oven oven;

    public OvenTempAdapter(Oven t){this.oven = t;}

    @Override
    public double getValue() {
        return convertCtoF(oven.getValue());
    }

    private double convertCtoF(double t){
        t = ((t*9)/5) + 32;
        return t;
    }
}
