class Node{
    int val;
    Node next;
    Node(int x){
        this.val=x;
        this.next=null;
    }
}
class Linkedlist{
    static Node createList(int a[])
    {Node head=null;
        for(int i=0;i<a.length;i++)
        {
            Node j=new Node(a[i]);
            if(head==null)
            head=j;
            else{
                Node ptr=head;
                while(ptr.next!=null)
                {
                    ptr=ptr.next;
                }
                ptr.next=j;
            }
        }
        return head;
    }
    static Node insertstart(Node head,int k)
    {
        Node   j=new Node(k);
        if(head==null)
        {   
            head=j;
        }
        else
        {
            j.next=head;
            head=j;
        }
        return head;
    }
    static Node insertend(Node head,int k)
    {
        Node j=new Node(k);
        if(head==null)
        head=j;
        else{
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=j;
        }
        return head;
    }
    static void printList(Node head)
    {
        Node ptr=head;
        while(ptr.next!=null)
        {
            System.out.print(ptr.val);
            ptr=ptr.next;
        }
        System.out.print(ptr.val);
        System.out.println();
    }
    static Node insertAfter(Node head,int pos,int val)
    {
        Node ptr=head;
        while(ptr.val!=pos)
        {
           ptr=ptr.next;
        }
        Node j=new Node(val);
        j.next=ptr.next;
        ptr.next=j;

        return head;
    }
    static Node insertbefore(Node head,int pos,int val){
        Node ptr=head;
        Node pre=ptr;
        while(ptr.val!=pos)
        {
            pre=ptr;
            ptr=ptr.next;
        }
    
        Node j=new Node(val);
        j.next=ptr;
        pre.next=j;
        ptr=head;
        return head;
    }
    static Node deletestart(Node head)
    {
        if(head!=null)
        head=head.next;
        return head;
    }
    static Node deletelast(Node head)
    {
        if(head==null)
        return head;
        Node ptr=head;
        Node pre=ptr;
        while(ptr.next!=null)
        {
            pre=ptr;
            ptr=ptr.next;
        }
        pre.next=null;
        return head;

    }
    static  Node deletevalue(Node head,int x)
    {
        if(head==null)
        return head;
        if(head.val==x)
        return head.next;
        Node ptr=head;
        Node pre=ptr;
        while(ptr.val!=x)
        {
            pre=ptr;
            ptr=ptr.next;
        } 
        pre.next=ptr.next;
        return head;
    }
    static Node reverselist(Node head)
    {
        // Node p=null;
        // Node n=null;
        // Node c=head;
        // while(c!=null)
        // {
        //     n=c.next;
        //     c.next=p;
        //     p=c;
        //     c=n;
        // }
        // return p;
       
        
            Node ptr=head;
            Node k=new Node(ptr.val);
            ptr=ptr.next;
            while(ptr!=null)
            {
                Node j=new Node(ptr.val);
                j.next=k;
                k=j;
                ptr=ptr.next;
            }
        
        return k;
    }
    static void oddeven(Node head)
    {
        int o=0,e=0;
    Node ptr=head;
    while(ptr!=null)
    {
        if((ptr.val)%2==0)
        e+=ptr.val;
        else
        o+=ptr.val;
        ptr=ptr.next;
    }
    System.out.println(Math.abs(o-e));
    }
    static String pallin(Node head,Node hea)
    {
        Node ptr=head;
        while(ptr!=null && hea!=null)
        {
            if(ptr.val!=hea.val)
            return "not pallin";
            ptr=ptr.next;
            hea=hea.next;
        }
        return "pallin";
       
    }
    public static void main(String[] args) {
    Node head=null;
    int a[]={1,2,3,4,3,2,1};
    head=createList(a);
    // printList(head);
    // head=insertend(head, 9);
    // printList(head);
    // head=insertstart(head, 0);
    // printList(head);
    // head=insertAfter(head, 2, 5);
    // printList(head);
    // head=insertbefore(head, 3, 7);
    // printList(head);
    // head=deletestart(head);
    // printList(head);
    // head=deletelast(head);
    // printList(head);
   // head=deletevalue(head, 9);
    // printList(head);
    // head=reverselist(head);
    // printList(head);
    oddeven(head);
    Node ptr=head;
    Node hea=reverselist(ptr);
    printList(hea);
    printList(head);
    System.out.println(pallin(head,hea));
    }
}