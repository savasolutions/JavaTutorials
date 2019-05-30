package com.javaproject;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

interface display<T>
{
   abstract public void print(T a);
}

public class LambdaExpressionOne {
    public static void main(String[] args) {
        display<Integer> dp=(Integer i)->System.out.println(i);
        dp.print(6);

        List li=Arrays.asList(23,78,45,67,90,12);
        Consumer<Integer> c=(Integer i)->System.out.println(i);
        li.forEach(c);
        System.out.println("Even numbers from list");
        Consumer<Integer> c2=(Integer i)->{if(i%2==0)System.out.println(i);};
        li.forEach(c2);

    }
}
