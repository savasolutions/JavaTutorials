package com.AbstractFactory;

public class CarFactory {
    public static Car buildCar(Model t)
    {
        Car c=null;
        Location l=Location.India;
        switch (l)
        {
            case US:
                c=UsFactory.build(t);
                break;
            case India:
                c=IndiaFactory.build(t);
                break;
            case Default:
                c=DefaultFactory.build(t);
                break;
        }
        return c;
    }
}
