class forloop{
    public static void main(String[] args) {
        int num = 5;
        int c = 1;
        int i = num;

        System.out.println("The table is ::");

        
        while (i <= num * 10) {
            System.out.println(num + " X " + c + " = " + i);
            i += num;
            c++;
        }

       
        c = 1;
        i = num;

        System.out.println("\nThe table using do-while loop is ::");

       
        do {
            System.out.println(num + " X " + c + " = " + i);
            i += num;
            c++;
        } while (i <= num * 10);
    }
}