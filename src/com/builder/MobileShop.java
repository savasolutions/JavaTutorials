package com.builder;

public class MobileShop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setscreenSize("5inch").setbcamera("15mpx").setfcamera("12mpx").getPhone();
        p.print();

    }
}
