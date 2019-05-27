package com.javaproject;

public class SumOfNumbers
{
    public int getSum(int num)
    {
        int i;
        int sum=0;
        for(i=1;i<=num;i++)
        {
         sum=sum+i;
        }
        return sum;
    }
    public boolean isDiv_By3(int num)
    {
        int check;
        check=num%3;
        if(check==0)
        return true;
        else
            return false;
    }
    public boolean isDiv_By5(int num)
    {
        int check;
        check=num%5;
        if(check==0)
            return true;
        else
            return false;
    }
    public int getSum_DivBy_3or5(int num)
    {
        int i;
        int sum=0;
        for(i=1;i<=num;i++)
        {
            if(isDiv_By3(i) && isDiv_By5(i))
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Main ob=new Main();
        SumOfNumbers sumOb=new SumOfNumbers();
      ob.print("Enter a number:");
      String in_num=ob.getString();
      int num=ob.stringToInt(in_num);
      int sum=sumOb.getSum(num);
      int sum2=sumOb.getSum_DivBy_3or5(num);
        ob.print("Sum of numbers from 1 to "+num+" is "+sum);
        ob.print("Sum of numbers from 1 to "+num+" divisible by 3 and 5 is "+sum2);

    }

}
