import java.util.Scanner;

public class clearbit {
 public static void main(String agrs[])
 {
    Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=sc.nextInt();
        int bm=1<<i;
        int Bm= ~(bm);
        int cb= (Bm & num);
        System.out.println(cb);
 }
}
