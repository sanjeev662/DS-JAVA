class Binary {
    public static void main(String[] args)
    {
        int m=0;
        int input=5;
        int size=5;
        int arr[]=new int[size];
        for(int i=0;i<=size;i++)
        {
        if(input>0)
        {
            m=input%2;
            input=input/2;
            arr[i]=m;
        }
        }
    for(int i=size-1;i>=0;i--)
     {
        int w=arr[i];
       System.out.print(w);
     }
}
}
