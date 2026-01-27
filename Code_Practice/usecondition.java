import java.util.*;
public class usecondition {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int but=sc.nextInt();
        switch (but) {
            case 1:
                System.out.println("Fucker");
                break;
            case 2:
            System.out.println("Sucker");
            break;
            default:
            System.out.println("Mother FUcker");
                break;
        }
        int n=sc.nextInt();
        int i=0;
        while (i<=10) {
           System.out.println(n*i);
            i++;
        }
    }
}
