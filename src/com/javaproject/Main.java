// program to find the sum of digits
package com.javaproject;

public class Main {
    int sum;
    Main(int num)
    {
       sum=sumDigits(num);
    }
    public int sumDigits(int num)
    {
        int sum=0;
        int digit;
        while (num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int number=1024;
        Main obj1=new Main(number);
        System.out.print("Sum of digits in number "+number+" is "+obj1.sum);
    }
}
