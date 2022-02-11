import java.util.Scanner;

class facto3 {
    int i, fact = 1;
    int number;

    facto3(int a) {
        number = a;
    }

    int cal() {
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    void display() {
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}


public class Factorial3 {
    public static void main(String args[]) {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = ob.nextInt();
        facto3 OBJ = new  facto3(n);
        System.out.println("Factorial = " + OBJ.cal());
        ob.close();
    }

}
