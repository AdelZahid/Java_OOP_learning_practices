import java.util.*;

public class string {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(s1.length());
        for(int i=0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i));
        }
        String s2=sc.nextLine();
        if(s1.compareTo(s2)==0)
        {
            System.out.println("Hello1");
        }else
        {
            System.out.println("Hello2");
        }
        String s3=s1.substring(4, 10);
        System.out.println(s3);
        StringBuilder sb= new StringBuilder(s3);
        sb.insert(1,'P');
        System.out.println(sb);
        sb.delete(2,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
