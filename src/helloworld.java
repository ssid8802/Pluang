import java.util.Scanner;  // Import the Scanner class

public class helloworld {
    public static void main(String[] args)
    {
        System.out.println("Hello Siddharth");

       // Scanner a = new Scanner(System.in);
        //Scanner b = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);

        int a = myObj.nextInt();
        int b = myObj.nextInt();
    //    int c = a + b;
        System.out.println(a + b);
    }
}
