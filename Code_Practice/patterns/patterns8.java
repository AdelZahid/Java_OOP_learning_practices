import java.util.*;
public class patterns8 {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=n;j++)
            {
                if (j<=n-i) {
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
            System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
