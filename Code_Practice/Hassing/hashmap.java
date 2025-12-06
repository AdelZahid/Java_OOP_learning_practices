import java.util.*;
public class hashmap {

    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Bangladesh", 12);
        map.put("India", 120);
        map.put("Chaina", 150);
        map.put("Nepal", 100);
        System.out.println(map);
        /*if a key is already inserted in a map
         * then if we again put the key with the
         * diffirent value then it will update the 
         * value of the key for the current inserted 
         * value
         */
        map.put("Bangladesh", 18);
        System.out.println(map);
        if (map.containsKey("India")) {
            System.out.println("present");
        }else{
            System.out.println("Not present");
        }
        System.out.println(map.get("Bangladesh"));
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();
        for(int val: map.values()){
            System.out.print(val+" ");
        }
        System.out.println();
        Set<String>keys= map.keySet();
        for(String key:keys)
        {
              System.out.println(key+ " "+ map.get(key));
        }
    }
}
