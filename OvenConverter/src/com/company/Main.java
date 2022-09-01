package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Oven o = new OvenTemp(25);
        System.out.println(o.getValue());

        OvenAdapter oa = new OvenTempAdapter(o);
        System.out.println(oa.getValue());
    }
}
