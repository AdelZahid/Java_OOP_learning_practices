import java.util.*;

public class recursion {
    public static void nsum(int n,int sum)
    {
        
        if (n==0) {
            System.out.println(sum);
            return ;
        }
        if (n<0) {
            System.out.println(1);
        }
        else{  
            sum*=n;
             nsum(n-1,sum);
        }
    }

    public static void main(String agrs[])
    {
        int sum=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nsum(n,sum);
    }
}

