public class Queue {
    public static void main(String ar[])
    {
        JavaQueue sc=new JavaQueue();
        sc.enqueue(4);
        sc.enqueue(6);
        sc.enqueue(8);
        //sc.dequeue();
        sc.dequeue();
        sc.print();
    }
    
}
class JavaQueue{
    int n=5;
    int arr[]=new int[n];
    int front = -1, rear = -1;

    boolean isFull() {
        if (rear == n- 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front==-1 || front>rear) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int value) {
        if (!isFull()) {
            rear++;
            arr[rear] = value;
            //System.out.println("Enque element is " + value);
        } else {
            System.out.println("Queue is Full");
        }
       if(front==-1) front++;
    }

    int dequeue() {
        int temp = -1;
        if (!isEmpty()) {
            front++;
            temp = arr[front];
            return temp;
        } else {
            System.out.println("Queue is Empty");
            return temp;
        }
        
    }
    void print()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}