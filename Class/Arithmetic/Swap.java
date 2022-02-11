import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        //int a,b,temp;
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number = ");
        a = sc.nextInt();
        System.out.print("Enter second number = ");
        b = sc.nextInt();

        System.out.println("\nBefore Swapping");
        System.out.println("first number = = " + a);
        System.out.println("second number = " + b);

        //temp=a;a=b;b=temp;
        //a=a+b;b=a-b;a=a-b;
        //a=a*b;b=a/b;a=a/b;
        //b = ( a + b ) - ( a = b);
        b = ( a * b )/( a = b);

        System.out.println("\nAfter Swapping");
        System.out.println("first number = = " + a);
        System.out.println("second number = " + b);
        sc.close();

    }
}
