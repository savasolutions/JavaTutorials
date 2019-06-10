package com.factory;

public class factory {
    public OS osType(String type)
    {
        if(type=="open")
            return new Android().spec();
        else if(type=="secure")
            return new Ios().spec();
        else
            return new Windows().spec();
    }
}
