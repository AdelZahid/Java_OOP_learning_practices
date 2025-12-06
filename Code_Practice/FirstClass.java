import java.util.*;
public class FirstClass {
    public static void main(String args[]){
        System.out.print("Hello fuckers");
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        int a=34;
        int b= 55;
        String men="Tony stark";
        System.out.println(men);
        System.out.println((a*b)/(b-a));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        String name=sc.next();
        System.out.println(name);
    }
}
