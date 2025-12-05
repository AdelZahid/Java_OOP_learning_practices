import java.util.Scanner;

public class pathinmaze 
{
    public static int path(int i,int j,int n,int m)
    {
        if (i==n || j==m)
         return 0;
        if (i==n-1 && j==m-1) 
        {
            return 1;
        }
        int right=path(i+1, j, n, m);
        int down=path(i,j+1, n, m);
        return right+down;
    }
    public static void main(String agrs[])
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Number of paths: "+path(0,0,m,n));
    }
}
