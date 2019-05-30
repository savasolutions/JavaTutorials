package collections;

import java.util.*;

public class CollectionSort {
    public static void main(String args[]) {
        //Main ob=new Main();
        List<Integer> li = new ArrayList<Integer>();
        li.add(8);
        li.add(56);
        li.add(23);
        li.add(97);
        li.add(4);
        li.add(80);
        li.add(1, 45);
        Comparator<Integer> c=new comp();
        Collections.sort(li,c);
        for (Integer i : li)
        {
            System.out.println(i);
        }
    }

}
