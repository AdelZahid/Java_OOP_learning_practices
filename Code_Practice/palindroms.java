import java.util.*;
public class palindroms {
    Node head;
    class Node{
      int data;
      Node next;
      Node(int data)
      {
        this.data=data;
        this.next=null;
      }
    }

      public void addLast(int data)
      {
        Node newnNode=new Node(data);
        if (head==null) {
            head=newnNode;
        }else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newnNode;
        }
      }
      void print(){
        Node temp=head;
        while (temp!=null) 
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
      }
      public Node reverse(Node head)
      {
        if (head == null || head.next==null) {
            return head;
        }
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
      }
      public  boolean ispalindrome(Node head)
      {
         if (head == null || head.next==null) {
            return true;
        }
        Node mid=findmid( head);
        Node Secondhalfstart=reverse(mid.next);
        Node firsthalfstart=head;
        while (Secondhalfstart!=null) {
            if (Secondhalfstart.data!=firsthalfstart.data) {
                return false;
            }
            Secondhalfstart=Secondhalfstart.next;
            firsthalfstart=firsthalfstart.next;
        }
        return true;
      }
      public Node findmid(Node head)
      {
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindroms list = new palindroms(); 
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.addLast(x);
        }
        list.print();
        if (list.ispalindrome(list.head)) {
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
      }
    }

