package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapExampleOne {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("Daughter Name","Savariya");
        map.put("Husband Name","Saran");
        map.put("Sister Name","Asha");
        map.put("Mother Name","Anandavally");
        map.put("My Name","Aswathy");

        System.out.println(map.get("Mother Name"));
        Set<String> set=map.keySet();
        for(String s:set)
        {
            System.out.println("Key:"+s+" Value:"+map.get(s));
        }
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }

    }
}
