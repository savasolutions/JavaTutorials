package com.AbstractFactory;

public class IndiaFactory {
    public static Car build(Model m)
    {
        Car c=null;
        switch (m)
        {
            case mini:c=new MiniCar(Location.India);
                break;
            case luxury:
                c=new LuxuryCar(Location.India);
                break;

        }
        return c;
    }
}
