class SortSelection {
    public static void main(String[] args)
    {
        int ar[]={7,6,2,9,3};
        for(int i=0;i<ar.length;i++)
        {
            int min_index=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[min_index]>ar[j])
                {
                  min_index=j;   
                }
                int t=ar[i];
                ar[i]=ar[min_index];
                ar[min_index]=t;
            }
        }
        for(int i=0;i<ar.length;i++)
        {
        System.out.println(ar[i]);
        }  
    }
}
