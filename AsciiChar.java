class AsciiChar {
    public static void main(String[] args)
    {
        int arr[]={65,66,67,91};
        char ch[]=new char[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ch[i]=(char)arr[i];  
            System.out.print(ch[i]);
        }
    }
}
