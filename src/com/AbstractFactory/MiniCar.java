package com.AbstractFactory;

public class MiniCar extends Car{
    MiniCar(Location loc)
    {
        super(loc,Model.mini);
        construct();
    }
    public void construct()
    {
       System.out.println("MiniCar");
    }
}
