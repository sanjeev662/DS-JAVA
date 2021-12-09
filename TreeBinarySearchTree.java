public class TreeBinarySearchTree 
{
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int x)
        {
            data=x;
            left=null;
            right=null;
        }
    }
        Node root=null;

        //for Input using recursion
        void insert(int x)
        {
          root=insertrec(root,x);
        }
        Node insertrec(Node temp,int x)
        {  
            if(temp==null)
            {
             temp=new Node(x);
             return temp;
            }
            else if(x<temp.data)
            {
                temp.left=insertrec(temp.left,x);
            }
            else if(x>temp.data)
            {
                temp.right=insertrec(temp.right,x);
            }
            return temp;
        }

        //for Output

        //By method InOrder
        void displayIn()
        {
             inorder(root);
        }
        void inorder(Node temp)
        {
           if(temp==null)
           {
               return;
           }          
           inorder(temp.left);
           System.out.print(temp.data+" ");
           inorder(temp.right);  
        }

        //By method PostOrder
        void displayPo()
        {
             postorder(root);
        }
        void postorder(Node temp)
        {
           if(temp==null)
           {
               return;
           }          
           postorder(temp.left);
           postorder(temp.right); 
           System.out.print(temp.data+" "); 
        }

        //By method PreOrder
        void displayPre()
        {
             preorder(root);
        }
        void preorder(Node temp)
        {
           if(temp==null)
           {
               return;
           }  
           System.out.print(temp.data+" ");        
           preorder(temp.left);
           preorder(temp.right);  
        }
    
    public static void main(String arg[])
    {
        TreeBinarySearchTree t=new TreeBinarySearchTree();
        int ar[]={6,5,8,9,2,7,1};
        for(int i=0;i<ar.length;i++)
        {
            t.insert(ar[i]);
        }        
        t.displayIn();
        System.out.println(); 
        t.displayPo();
        System.out.println(); 
        t.displayPre();
    }
}
