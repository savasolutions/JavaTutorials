package com.javaproject;
import java.util.Scanner;
import java.lang.Math;
public class AngleClockHands {
    public int stringToInt(String str)
    {
        int integer=Integer.parseInt(str);
        return integer;
    }
    public String getString(Scanner ob)
    {
        String str=ob.nextLine();
        return str;
    }
    public int computeAngle(int hour,int min)
    {
        int m,h;
        int  angle,hourAngle,minAngle;
        if(hour==12)
            h=0;
        hourAngle=(int) (hour*30+min*0.5);
        minAngle=min*6;
        angle=Math.abs(hourAngle-minAngle);
        if(angle>180)
            angle=360-angle;
        return angle;



    }
    public static void main(String argz[])
    {
       Scanner obj1=new Scanner(System.in);
       AngleClockHands obj2=new AngleClockHands();

       System.out.println("Enter the time");
        System.out.println("Hour");
        String hr=obj2.getString(obj1);
        System.out.println("Minute");
        String min=obj2.getString(obj1);
        int h=obj2.stringToInt(hr);
        int m=obj2.stringToInt(min);
        int angle=obj2.computeAngle(h,m);
        System.out.println("Angle between the hour hand and min hand at time "+hr+":"+min+" is: "+angle);

    }
}
