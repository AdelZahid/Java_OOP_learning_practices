import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(7);
        set.add(2);
        System.out.println(set);
        if (set.contains(8)) {
            System.out.println("Yes contain");
        }else{
            System.out.println("Not contain");
        }
        set.remove(4);
        if (!set.contains(4)) {
            System.out.println("Doent contain");
        }
        System.out.println(set.size());
        System.out.println(set);
        Iterator it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
