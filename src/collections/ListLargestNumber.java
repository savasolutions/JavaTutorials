package collections;
import com.javaproject.Main;

import java.util.ArrayList;
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
        Iterator<Integer> itr=li.iterator();
        Integer num;
        num=0;
        while (itr.hasNext())
        {
            num=itr.next();
            System.out.println(num);
        }
    }
}
