package com.singleton;

public class main {
    public static void main(String[] args) {
        SingletonClass a=SingletonClass.getInstance();
        SingletonClass b=SingletonClass.getInstance();
        SingletonClass c=SingletonClass.getInstance();
        a.s=a.s.toUpperCase();
        System.out.println("a:"+a.s);
        System.out.println("b:"+b.s);
        System.out.println("c:"+c.s);
        c.s=c.s.toLowerCase();
        System.out.println("a:"+a.s);
        System.out.println("b:"+b.s);
        System.out.println("c:"+c.s);
    }
}
