package collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(56);
        set.add(78);
        set.add(23);
        set.add(68);
        set.add(45);
        set.add(98);
        set.add(23);
        for(int i:set)
        {
            System.out.println(i);
        }
        Set<Integer> Treeset=new TreeSet<>(set);
        for(int i:Treeset)
        {
            System.out.println(i);
        }
    }
}
