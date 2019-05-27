package com.javaproject;

public class MultiplicationTable {
    int product[][]= new int[20][20];
    int i,j;

    public void getTable()
    {
        Main ob=new Main();
        for(i=1;i<=12;i++)
        {
            for(j=1;j<=12;j++)
            {
                product[i][j]=i*j;
            }
        }
        ob.print("Multiplication Table");
        for(j=1;j<=12;j++)
        {
            System.out.print("\t"+j);
        }
        ob.print(" ");
        for(i=1;i<=12;i++)
        {
            System.out.print(i+"\t");
            for(j=1;j<=12;j++)
            {
                System.out.print(product[i][j]+"\t");
            }
            ob.print(" ");
        }
    }
    public static void main(String args[])
    {
        MultiplicationTable mt=new MultiplicationTable();
        mt.getTable();
    }
}
