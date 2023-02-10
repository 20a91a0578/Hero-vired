class Node{
    int data;
    Node prev;
    Node next;
    Node(int x)
    {
        this.data=x;
        this.next=null;
        this.prev=null;
    }
}
public class Doublinklist {
    static Node generate(int a[]){
        Node head=null;
        for(int i=0;i<a.length;i++)
        {
            Node j=new Node(a[i]);
            if(head==null)
            head=j;
            else{
                j.next=head;
                head.prev=j;
                head=j;
            }
        }
        return head;
    }
    static void printdll(Node head)
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    static Node insertstart(Node head,int x){
        Node j=new Node(x);
        if(head==null)
        head=j;
        else
        {
            j.next=head;
            head.prev=j;
            head=j;
        }
        return head;
    }
    static Node insertend(Node head,int x)
    {
        Node j=new Node(x);
        if(head==null)
        head=j;
        else{
            Node ptr=head;
            
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=j;
            j.prev=ptr;

        }
        return head;
    }
    static Node insertafter(Node head,int x,int y)
    {
        Node ptr=head;
        Node j=new Node(y);
        while(ptr.data!=x)
       {
        ptr=ptr.next;
       }
        j.next=ptr.next;
        ptr.next.prev=j;
        ptr.next=j;
        j.prev=ptr;
        return head;
    }
    static Node insertbefore(Node head,int x,int y)
    {
        Node j=new Node(y);
        if(head.data==x)
        {
            j.next=head;
            head.prev=j;
            head=j;
        }
        else
        {
            Node ptr=head;
            Node pre=ptr;
            while(ptr.data!=x)
            {
                pre=ptr;
                ptr=ptr.next;
            }
            pre.next=j;
            j.prev=pre;
            j.next=ptr;
            ptr.prev=j;
        }
        return head;
    }
    static Node deletestart(Node head)
    {
        if(head==null)
        return head;
        else
        {
            head=head.next;
            head.prev=null;
        }
        return head;
    }
    static Node deleteend(Node head)
    {
        if(head==null)
        return head;
        else
        {Node ptr=head;
            while(ptr.next!=null)
            ptr=ptr.next;
        
        ptr.prev.next=null;
        ptr.prev=null;
        }
        return head;
    }
    static Node deleteval(Node head,int x)
    {
        if(head==null)
        return head;
        else if(head.data==x)
        {
            head=head.next;
            head.prev=null;
        }
        else{
            Node ptr=head;
            Node pre=ptr;
            while(ptr.data!=x)
            {
                pre=ptr;
                ptr=ptr.next;
            }
           if(ptr.next!=null)
           {
            pre.next=ptr.next;
            ptr.next.prev=pre;
           }
           else{
            pre.next=null;
            ptr.prev=null;
           }

        }
        return head;
    }
    static Node deleteafter(Node head,int x)
    {
        Node ptr=head;
        Node pre=ptr;
        while(pre.data!=x)
        {
            pre=ptr;
            ptr=ptr.next;
        }
pre.next=ptr.next;
ptr.next.prev=pre;
ptr.prev=null;
        return head;
    }
    static Node deletebefore(Node head,int x)
    {
        Node ptr=head;
        Node pre=ptr;
        while(ptr.data!=x)
        {
            pre=ptr;
            ptr=ptr.next;
        }
        if(pre.prev!=null)
        {
            ptr.prev=pre.prev;
        pre.prev.next=ptr;
        pre.next=null;
        pre.prev=null;
        }
        else
        {
            ptr.prev=null;
            head=pre.next;
        }
        return head;
    } 
    static Node reverselist(Node head)
    {
        Node p=null;
        Node n=null;
        Node c=head;
        while(c!=null)
        {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
  public static void main(String[] args) {
    Node head=null;
    int a[]={1,2,3,4,5};
    head=generate(a);
    printdll(head);
    // head=insertstart(head, 0);
    // printdll(head);
    // head=insertend(head, 0);
    // printdll(head);
    // head=insertafter(head, 3, 9);
    // printdll(head);
    // head=insertbefore(head, 1, 0);
    // head=deletestart(head);
    // head=deleteend(head);
    // head=deleteval(head, 3);
   // head=deleteafter(head,3);
  // head=deletebefore(head, 4);
  head=reverselist(head);
    printdll(head);

  }  
}
