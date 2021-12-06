public class SortNumSort { 
     public static void main(String ar[])
    {   int i;
        int num[]={3,6,4,1};
        for(i=0;i<num.length;i++)
        {
            for(int j=1;j<num.length-i;j++)
            {
                int temp=0;
                if(num[j-1]>num[j])
                {
                   temp=num[j-1];
                   num[j-1]=num[j];
                   num[j]=temp;
                }
                
            }
        }
        for(i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
    
}
