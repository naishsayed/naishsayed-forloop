class forloop
{
    public static void main(String[]args)
    {
        int num=5;
        int c=1;


        System.err.println("The table is ::");
        for(int i=num;i<=num*10;i+=num)
        {
            System.out.println(num + "X" + c + " = " + i);
            c++;
        }
    }
}