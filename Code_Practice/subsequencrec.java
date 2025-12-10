import java.util.*;

public class subsequencrec {
    public static void msub(String s,int i,String ns)
    {
        if (i==s.length())
         {
            System.out.println(ns);
            return;
        }
        char c = s.charAt(i);
        msub(s, i+1, ns + c);  
        msub(s, i+1 , ns); 
    }
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         msub(s,0,"");
    }
}
