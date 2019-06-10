package com.builder;

public class PhoneBuilder {
    public String screenSize;
    public String battery;
    public String os;
    public String fcamera;
    public String bcamera;
    public PhoneBuilder setscreenSize(String screenSize )
    {
      this.screenSize=screenSize;
      return this;
    }
    public PhoneBuilder setbattery(String battery )
    {
        this.battery=battery;
        return this;
    }public PhoneBuilder setos(String os )
    {
        this.os=os;
        return this;
    }public PhoneBuilder setfcamera(String fcamera )
    {
        this.fcamera=fcamera;
        return this;
    }public PhoneBuilder setbcamera(String bcamera )
    {
        this.bcamera=bcamera;
        return this;
    }
    public Phone getPhone()
    {
        Phone p=new Phone(this);
        return p;
    }

}
