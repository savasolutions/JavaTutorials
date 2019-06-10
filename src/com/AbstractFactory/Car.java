package com.AbstractFactory;
enum Location
{
    US,India,Default;
}
enum Model
{
    mini,luxury;
}
abstract class Car {
    Location loc;
    Model type;
    Car(Location loc, Model type)
    {
       this.loc=loc;
       this.type=type;
        System.out.println(this.loc);
    }
    abstract void construct();
}
