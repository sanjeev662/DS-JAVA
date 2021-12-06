class LinkedListSingly {
    public static void main(String[] args) {
        linkedlists ll = new linkedlists();
        ll.addBeg(7);
        ll.addBeg(8);
        ll.addBeg(6);
        ll.addBeg(4);
        ll.addMid(2,9);
        //ll.addEnd(1);
        //ll.delEnd();
        ll.delMid(4);
        ll.display();
    }

}

class node

{
    int data;
 node next;
}

class linkedlists {
 node head = null;

    void addBeg(int s) {
     node aa = new node();
        aa.data = s;
        aa.next = head;
        head = aa;
    }
    
    void addMid(int index,int m)
    {
     node curr=head;
     node mm=new node();
        mm.data=m;
        int i=0;
        while(i!=index-1)
        {
            curr=curr.next;
            i++;
        }
        mm.next=curr.next;
        curr.next=mm;
    }

    void delEnd()
    {
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        System.gc();
    }

    void delMid(int index)
    {
        node temp=head;
        int i=1;
        while(i<=index-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=null;
        System.gc();
    }

    /*void addEnd(int z)
    {
        node zz=new node();
        zz.data=z; 
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        zz.next=temp;
        temp.next=null;
    }*/

    void display() {
        if (head == null)
            System.out.println("list is empty");
        else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
}