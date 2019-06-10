package com.factory;

public class FactoryMain {
    public static void main(String[] args) {
        factory f=new factory();
        OS op=f.osType("open");
    }
}
