public class DemoInteger {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // define variable y to store an integer value 100
        int y = 100;
        // print out variable y
        System.out.println(y);

        // Re-assignment
        y = 200;
        System.out.println(y);
        
        // int is a data type
        // !We cannot re-define the type of y
        // We can define the type of y once
        // int y = 200;

        //+ - * /
        int a = 1 + 2;
        System.out.println(a);// 3

        // from right to left
        // 1. y + 2 -> 202
        // 2. Assign 202 into y.
        y = y + 2;
        System.out.println(y); // 202

        int b = 99;
        int q = b - 200;
        System.out.println(q);

        q = q * 10;
        System.out.println(q);

        int bootcamp = 6 + 10 * 5;
        System.out.println(bootcamp);

        // ! Put 2.5 into an integer variable -> trim decimal places (Java)
        int r2 = 5 / 2;
        System.out.println(r2);



    }
}
