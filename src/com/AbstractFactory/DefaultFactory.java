package com.AbstractFactory;

public class DefaultFactory {
    public static Car build(Model m)
    {
        Car c=null;
        switch (m)
        {
            case mini:c=new MiniCar(Location.Default);
                break;
            case luxury:
                c=new LuxuryCar(Location.Default);
                break;

        }
        return c;
    }
}
