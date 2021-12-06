public class ArrayMaximum {
    public static void main(String[] args) {
        int x[]={2,5,1,9};
        int temp=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>temp)
            {
                temp=x[i];
            }
        }
        System.out.println(temp);
    }
    
}
