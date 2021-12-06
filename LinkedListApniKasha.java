public class LinkedListApniKasha 
{
    public static void main(String[] args)
    {
        LinkedListS ll=new LinkedListS();
        ll.insertAtTail(7);
        ll.insertAtTail(8);
        ll.insertAtTail(6);
        ll.display();
    }
}
class node
{
    int data;
    node next;
    node(int val)
    {
        data=val;
        next=null;
    }
}
class LinkedListS
{
    public node head=null;
    public node tail=null;

    public void insertAtTail(int val)
    {
         node inputdata=new node(val);
         if(head==null)
         {
             head=inputdata;
             tail=inputdata;
         }
         else
         {
            tail.next=inputdata;
            tail=inputdata;
         }
    }
    public void insertAtMid(int position,int val)
    {
        node inputdata=new node(val);
        node temp=head;
        int i=0;
        while(i!=position-1)
        {
            temp=temp.next;
            i++;
        }
        inputdata.next=temp.next;
        temp.next=inputdata;
    }
    //for print
    public void display() {
		node current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

}
