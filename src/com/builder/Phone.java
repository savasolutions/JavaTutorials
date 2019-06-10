package com.builder;

public class Phone {
   private String screenSize;
    private String battery;
    private String os;
    private String fcamera;
    private String bcamera;
    public Phone(PhoneBuilder pb)
    {
        this.screenSize=pb.screenSize;
        this.battery=pb.battery;
        this.fcamera=pb.fcamera;
        this.bcamera=pb.bcamera;
        this.os=pb.os;
      //System.out.println(pb);
    }


    public void print() {
        System.out.println("Screensize:"+screenSize);
    }
}
