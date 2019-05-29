package collections;
import com.javaproject.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListLargestNumber {
    public static void main(String args[])
    {
        //Main ob=new Main();
        List<Integer> li=new ArrayList<Integer>();
        li.add(8);
        li.add(56);
        li.add(23);
        li.add(97);
        li.add(4);
        li.add(80);
        li.add(1,45);
        li.sort(null);
        Collections.reverse(li);
        Iterator<Integer> itr=li.iterator();
        Integer num;
        num=li.get(0);
        for (Integer i:li
             ) {
            System.out.println(i);
        }
        System.out.println("The largest number is "+num);
       /* while (itr.hasNext()) // using hasNext()
        {
            num=itr.next();
            System.out.println(num);
        }*/
       //li.forEach(System.out::println);// lambda expression
    }
}
