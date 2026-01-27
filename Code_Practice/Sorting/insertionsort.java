import java.util.*;

public class insertionsort {
    public static void main(String agrs[])
    {
       Scanner sc= new Scanner(System.in) ;
       int n=sc.nextInt();
       int ar[]= new int[n];
       for (int i = 0;i<n;++i){
        ar[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        int cur=ar[i];
        int j= i-1;
        while (j>=0 && cur<ar[j]) {
            ar[j+1]=ar[j];
            j--;
        }
        ar[j+1]=cur;
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(ar[i]);
    }
}
}
