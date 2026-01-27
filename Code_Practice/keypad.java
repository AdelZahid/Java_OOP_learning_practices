import java.util.Scanner;

public class keypad {
    public static String[] key={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void prncom(String s,int i,String cm)
    {
        if(i==s.length())
        {
            System.out.println(cm);
            return;
        }
        char cur=s.charAt(i);
        String map= key[cur-'0'];
        for(int j=0;j<map.length();j++)
        {
            prncom(s, i+1, cm+map.charAt(j));
        }
    }
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        prncom(s, 0, "");
    }
}
