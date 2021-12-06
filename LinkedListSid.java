class Node1{
    int item;
    Node1 next;

    public Node1(int item)
    {
        this.item=item;
        this.next=null;
    }
}


 class linklis1
    {
    public Node1 head = null;
    public Node1 tail = null;

    public void addnode(int data)
    {
        Node1 newNode1 = new Node1(data);

        if(head== null)
        {
            head = newNode1;
            tail = newNode1;
        }
        else{
            tail.next= newNode1;
            tail = newNode1;
        }
    }
 
    public void addNodeB(int data)
    {
        Node1 p = new Node1(data);
        p.next=head;
        head=p;
    }

    public void addNodeMid(int pos, int data)
    {
        Node1 p = new Node1(data);
        
        Node1 temp = head;
        int i=0;
        while(i!=pos-1 )
        {
            temp = temp.next;
            i++;
        }
        p.next=temp.next;
        temp.next=p;
    }
    void delNodeB()
    {
        head= head.next;
        System.gc();
    }

    void delNodeEn()
    {   
        Node1 temp =head;
        while(temp.next.next!= null)
        {
            temp=temp.next;
        }
        temp.next=null;
        System.gc();

    }

    void delNodeMid(int pos)
    {
        Node1 t=head;
        int i=1;
        while(i<pos-1)
        {
            t=t.next;
        }
        t.next=t.next.next;
        System.gc();

        }
    

    public void Display()
    {
        Node1 current = head;

        if(head == null)
        {
            System.out.println("List is empty");
            return;

        }
        while(current!=null){
            System.out.print(current.item + " ");
            current= current.next;
        }
        System.out.println();

    }


}
class LinkedListSid
{
    public static void main(String ar[])
    {
        linklis1 o= new linklis1();
        o.addnode(5);
        o.addnode(4);
        o.addnode(6);
        o.Display();
        //o.delNodeB();
        o.addNodeB(7);
        o.Display();
        o.delNodeEn();
        o.addNodeMid(2, 9);
        o.delNodeMid(1);
        o.Display();

    }
}