package com.AbstractFactory;

public class UsFactory {
    public static Car build(Model m)
    {
        Car c=null;
        switch (m)
        {
            case mini:c=new MiniCar(Location.US);
            break;
            case luxury:
                c=new LuxuryCar(Location.US);
                break;

        }
        return c;
    }
}
