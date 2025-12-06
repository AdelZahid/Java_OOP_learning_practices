import java.util.*;
public class getbit {
    public static void main(String agrs[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=sc.nextInt();
        int bm=1<<i;
         if ((num & bm)==0) {
            System.out.println("bit was 0");
         }else{
            System.out.println("bit was 1");
         }

    }
}
