class SortInsertion {
    public static void main(String[] args)
    {
        int arr[]={7,6,2,9,3};
        int sort[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && sort[j]>key)
            {
                sort[j+1]=sort[j];
                j=j-1; 
            }
            sort[j+1]=key;
        }
        for(int i=0;i<sort.length;i++)
        {
        System.out.println(sort[i]);
        }  
    }
}
