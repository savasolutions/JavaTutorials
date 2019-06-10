package com.AbstractFactory;

public class LuxuryCar extends Car {
    LuxuryCar(Location l)
    {
            super(l,Model.luxury);
            construct();

    }
    public void construct()
    {
        System.out.println("Luxury Car");
    }
}
