import java.util.*;
public class patterns5 {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=n;j++)
            {
                if ((j<=i) || (j>n-i)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(i=0;i<n/2;i++)
        {
            for(j=1;j<=n;j++)
            {
                if ((j<=(n/2-i)) || (j>(n/2+i))) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
