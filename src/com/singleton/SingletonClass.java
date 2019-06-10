package com.singleton;

public class SingletonClass {
    public String s;
    private static SingletonClass instance=null;
    private SingletonClass()
    {
       s="I am a string of singleton class";
    }

    public static SingletonClass getInstance() {
        if(instance==null)
        {
            instance=new SingletonClass();
            return instance;
        }
        return instance;
    }
}
