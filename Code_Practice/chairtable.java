 import java.util.*;
 class Chair{
    public int hight;
    public int witdh;
    Chair ()
    {
    }
    Chair(int h,int w)
    {
        this.hight=h;
        this.witdh=w;
    }
 }
 class Table{
    private int hight;
    private int witdh;
    Table(int h,int w)
    {
        this.hight=h;
        this.witdh=w;

    }
    public void seth(int h)
    {
        this.hight=h;
    }
    public void setw(int w)
    {
        this.witdh=w;
    }
    public int geth()
    {
       return this.hight;
    }
    public int getw()
    {
        return this.witdh;
    }

 }
public class chairtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        Chair[]c=new Chair[n];
        Table[]t=new Table[m];
        for (int i = 0; i < n; i++) {
            int h,w;
            h=sc.nextInt();
            w=sc.nextInt();
            c[i]=new Chair(h,w);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Chair height is "+c[i].hight+" Chair width is "+c[i].witdh);
        }
        for (int i = 0; i < n; i++) {
            int hi,wi;
            hi=sc.nextInt();
            wi=sc.nextInt();
            t[i]=new Table(hi,wi);
        }
        for(int i=0;i<n;i++)
        {
        System.out.println("Table height is "+t[i].geth()+" Table width is "+t[i].getw());
        }
        
    }
}
