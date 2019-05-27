// program to find the sum of digits
package com.javaproject;

import java.util.Scanner;

public class Main {

    Main()
    {
        System.out.println("Welcome");
    }

    public int stringToInt(String str)
    {
        int integer=Integer.parseInt(str);
        return integer;
    }
    public void print(String str)
    {
        System.out.println(str);
    }
    public void print(int str)
    {
        System.out.println(str);
    }
    public String getString()
    {
        Scanner obj1=new Scanner(System.in);
        String str=obj1.nextLine();
        return str;
    }
    public int getInt()
    {
        Scanner obj1=new Scanner(System.in);
        String str=obj1.nextLine();
        int num=stringToInt(str);
        return num;
    }


}
