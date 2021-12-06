

class Stack {
public static void main(String[] args)
{
    Container co=new Container();
    co.push(4);
    co.push(5);
    co.push(6);
    co.show();
    co.pop();
    co.show();
}
    
}
class Container
{
        int arr[]=new int[10];
        int top=-1;
        void push(int a)
        {
            top ++;
            arr[top]=a;
        }
        int pop()
        {
            int b=arr[top];
            top--;
            return b;
        }
        void show()
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
}
