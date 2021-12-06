
public class SortCharSort 
{
    public static void main(String ar[])
    {   int temp,i;
        char ch[]={'b','d','a','c'};
        int arr[]=new int[ch.length];
        for(i=0;i<ch.length;i++)
        {
            arr[i]=ch[i];
        }
        for(i=0;i<ch.length;i++)
        {
            for(int j=1;j<ch.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                   temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
                }
                
            }
        }
        for(i=0;i<ch.length;i++)
        {
            ch[i]=(char)arr[i];
            System.out.println(ch[i]);
        }
    }
}
