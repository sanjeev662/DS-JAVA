public class LinkedListDoublyEx {
    public static void main(String[] args)
    {
       DoublyLinkedList dll=new DoublyLinkedList();
    dll.addBegning(7);
    dll.addBegning(8);
    dll.addBegning(6);
    dll.addBegning(9);
    dll.addBegning(5);
    dll.addBegning(3);
    dll.addMiddle(2,0);
    dll.addEnd(420);
    dll.delBegning();
    dll.delMidd(3);
    dll.delEnd();
    dll.display();
    }
}

class DoublyLinkedList
{
    class node
    {
    node prev;
    node next;
    int data;
    node(int d) {
        prev=null;
        next=null;
        data = d; }
    }
    node head;
    
    //Add begning
    public void addBegning(int t){
        node obj=new node(t);
        if(head==null)
        {
            head=obj;
        }
        else{
        head.prev=obj;
        obj.next=head;
        obj.prev=null;
        head=obj;
        }
    }
    
    //Add middle
    public void addMiddle(int ind,int m)
    {
        node temp=head;
        int i=0;
        while(head!=null && i<ind)
        {
            i++;
            head=head.next;
        }
        node newnode=new node(m);
        newnode.next=head.next;
        head.next.prev=newnode;
        head.next=newnode;
        newnode.prev=head;
        head=temp;
    }
    
    //Add End
    public void addEnd(int s)
    {
        node temp=head;
        while(head.next!=null)
        {
            head=head.next;
        }
        node newNode=new node(s);
        head.next=newNode;
        newNode.prev=head;
        newNode.next=null;
        head=temp;
    }

    //Delete Begning
    public void delBegning()
    {
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            head.next.prev=null;
            System.gc();
        }
    }

    //Delete Middle
    public void delMidd(int ind)
    {
        node temp=head;
        int i=0;
        while(head!=null && i<ind)
        {
            head=head.next;
            i++;
        }
        head.next.next.prev=head;
        head.next=head.next.next;
        head=temp;
        System.gc();
    }

    //Delete End
    public void delEnd()
    {
        while(head.next.next!=null)
        {
            head=head.next;
        }
        head.next=null;
        head.next.prev=head;
        System.gc();
    }

    //Display
    public void display()
    {
       while(head!=null)
            {
                System.out.println(head.data);
                head=head.next;
            }
    }
}
 