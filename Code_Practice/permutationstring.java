import java.util.Scanner;

public class permutationstring {
    public static void permu(String s,String ps)
    {
       if(s.length()==0)
       {
        System.out.println(ps);
       }
       for(int j=0;j<s.length();j++)
       {
        String str1 = s.substring(0,j)+s.substring(j+1);
        permu(str1,ps+s.charAt(j));
       }
    }
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permu(s, "");
    }
}
