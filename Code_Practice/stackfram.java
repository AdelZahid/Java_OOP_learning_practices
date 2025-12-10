import java.util.*;

public class stackfram {
    public static void pushbotom(int data,Stack<Integer> s)
    {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbotom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s.push(i);
        }
        int d=sc.nextInt();
        pushbotom(d,s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
