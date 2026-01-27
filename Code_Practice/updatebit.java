import java.util.*;

public class updatebit {
    public static void main(String agrs[])
    {
        
    Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int bm=1<<i;
        int sb;
         if (j==1) {
             sb= (bm | num);
         }else{
            sb=(~bm)&num;
         }
         System.out.println("the updated number is "+sb );
    }
}
