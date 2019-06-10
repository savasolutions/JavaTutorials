package com.factory;

public class Ios implements OS{
    @Override
    public OS spec() {
        System.out.println("IOS Closed and Secure");

        return null;
    }
}
