import java.util.*;
public class Patterns2 {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=0;j<r;j++)
            {
              if (j<r-i) {
                System.out.print(" ");
              }else{
                System.out.print("*");
              }
            }
            System.out.println();
        }
    }
}
