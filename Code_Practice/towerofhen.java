import java.util.*;

public class towerofhen {
    public static void hanio(int n,int s,int e)
    {
        if (n == 1)
        {
            pm(s,e);
        }
        else{
            int h=6-(s+e);
            hanio(n-1, s, h);
            pm(s,h);
            hanio(n-1,h,e);
        }
    }
    public static void pm(int s,int e)
    {
        System.out.println(s+"->"+e);
    }
    public static void main(String agrs[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        hanio(n, 1, 3);
        
    }
}
