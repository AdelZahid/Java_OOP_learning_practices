import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Arraylist {
    public static void main(String agrs[])
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int el=list.get(4);
        System.out.println(el);
        list.add(3,77);
        System.out.println(list);
        list.set(5, 89);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
    } 
}
