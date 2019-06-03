package com.javaproject;
class Square<T extends Number>
{
    public void getInput(T num)
    {
       display(num);
    }
    public void display(T num)
    {

       //System.out.println(num*num);
    }
}
public class GenericExampleTwo {
    public static void main(String[] args) {
        Main m=new Main();
        Square<Integer> sq=new Square<>();
        Square<Float> sqf=new Square<>();
        System.out.println("Enter the number:");
        String s=m.getString();
        if(s.indexOf(".")!=-1)
        {
            float i=Float.parseFloat(s);
            sqf.getInput(i);

        }
        else
        {
            int i=Integer.parseInt(s);
            sq.getInput(i);
        }



    }
}
