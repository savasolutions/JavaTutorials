package com.javaproject;

public class primeNumber extends Main{
    public int  computePrime(int n) {
        int i, j, flag = 0;
        i = 2;
        while (i < n && flag == 0) {
            int num = n % i;
            if (num == 0) {
                flag = 1;
            }
            i++;
        }
        return flag;
    }

    public void computeAllPrime(int n)
    {
        int i,flag;
        print("Prime numbers up to "+n);
        for(i=2;i<=n;i++)
        {
            flag=computePrime(i);
            if(flag==0)
            {
                print(i);
            }
        }
    }
    public static void main(String args[])
    {
        primeNumber pnum=new primeNumber();
        pnum.print("Enter a number to compute prime Or 0 to list all prime number between 0 and 1000");
        int num=pnum.getInt();
        if(num!=0) {
           int flag= pnum.computePrime(num);
            if(flag==1)
            {
                pnum.print("The number "+num+ " is not prime");
            }
            else
            {
                pnum.print("The number "+num+ " is  prime");
            }
        }
        else
        {
            pnum.computeAllPrime(1000);
        }



    }
}
