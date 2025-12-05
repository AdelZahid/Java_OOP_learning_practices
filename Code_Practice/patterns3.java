import java.util.*;
public class patterns3 {
    public static void main(String agrs[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
