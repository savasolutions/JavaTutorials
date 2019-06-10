package com.factory;

public class Windows implements OS{
    @Override
    public OS spec() {
        System.out.println("Windows I am going to die");

        return null;
    }
}

