import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class CircularList {
    static Node addToEnd(Node head,int data){
        Node j=new Node(data);
        if(head==null)
        {
            head=j;
            j.next=head;
        }
        else if(head.next==head)
        {
            head.next=j;
            j.next=head;
        }
        else{
            Node p=head;
            while(p.next!=head)
            {
                p=p.next;
            }
            p.next=j;
            j.next=head;
        }
        return head;
    }
    static Node addToStart(Node head,int data)
    {
        Node j=new Node(data);
        if(head==null)
        head=j;
        else if(head.next==head)
        {
            j.next=head;
            head.next=j;
            head=j;
        }
        else{
            Node p=head;
            j.next=head;
            while(p.next!=head){
                p=p.next;
            }
            p.next=j;
            head=j;
        }
        return head;
    }
    static Node converttoCircular(int a[]){
        Node head=null;
        for(int i=0;i<a.length;i++)
        {
            Node j=new Node(a[i]);
            if(head==null)
            {
                head=j;
                j.next=head;
            }
            else if(head.next==head)
            {
                head.next=j;
                j.next=head;
            }
            else{
                Node p=head;
                while(p.next!=head)
                {
                    p=p.next;
                }
                p.next=j;
                j.next=head;
            }
        }
        return head;
    }
    static Node addAfter(Node head,int pos,int val){
        Node j=new Node(val);
        Node p=head;
        while(p.next!=head)
        {
            p=p.next;
        }
        if(head.data==pos){
            j.next=head.next;
            head.next=j;
        }
        else if(p.data==val)
        {
            j.next=p.next;
            p.next=j;
        }
        else{
            p=head;
            while(p.data!=pos){
                p=p.next;
            }
            j.next=p.next;
            p.next=j;
        }
        return head;
    }
    static void printlist(Node head){
        Node p=head;
        while(p.next!=head)
    {
        System.out.print(p.data+" ");
        p=p.next;
    }    
System.out.print(p.data+"\n");

}
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]={2,5,4,6,6,7,8};
    Node head=converttoCircular(a);
    printlist(head);
    head=addToStart(head, 0);
    printlist(head);
    head=addToStart(head, 586);
    printlist(head);
    head=addToEnd(head, 0);
    printlist(head);
    head=addToEnd(head, 909);
    printlist(head);
    System.out.println("Enter after which value you want to insert");
    int k=sc.nextInt();
    System.out.println("Enter the data");
    int g=sc.nextInt();
    head=addAfter(head, k, g);
    printlist(head);
    sc.close();
   } 
}
