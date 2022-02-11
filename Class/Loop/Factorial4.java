import java.util.Scanner;

class facto4 {
    int i, fact = 1;
    int number;

    facto4(int a) {
        number = a;
        i = 1;
    }

    int cal() {
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    void display() {
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

public class Factorial4 {
    public static void main(String args[]) {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = ob.nextInt();
        facto4 OBJ = new facto4(n);
        System.out.println("Factorial = " + OBJ.cal());
        ob.close();
    }
}
