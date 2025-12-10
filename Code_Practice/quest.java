import java.util.*;

public class quest {
    
    static class Queue{
      static int ar[];
    static int size;
    static int rear=-1;
    Queue(int n){
        ar=new int[n];
        this.size=n;
    }
    public static boolean isempty()
    {
        return rear==-1;
    }

    public static void add(int data)
    {
       if (rear== size-1) {
        System.out.println("Full");
        return;
       }
       rear++;
       ar[rear]=data;
    }
    public static int remove()
    {
       if (isempty()) {
        System.out.println("Empty");
         return -1;
       }
       int front=ar[0];
       for(int i=0;i<rear;i++)
       {
        ar[i]=ar[i+1];
       }
       rear--;
       return front;
    }
    public static int peek()
    {
        if (isempty()) {
            System.out.println("Empty");
            return-1;
        }
        return ar[0];
    }
    }
    public static void main(String agrs[])
    {
        Queue q= new Queue(7);
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(9);
        q.add(4);
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
