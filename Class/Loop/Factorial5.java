import java.util.Scanner;

class facto5 {
    int i, fact = 1;
    int number;

    facto5(int a) {
        number = a;
        i = 1;
    }

    int cal() {
        do {
            fact = fact * i;
            i++;
        } while (i <= number);
        return fact;
    }

    void display() {
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

public class Factorial5 {
    public static void main(String args[]) {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = ob.nextInt();
        facto5 OBJ = new facto5(n);
        System.out.println("Factorial = " + OBJ.cal());
        ob.close();
    }
}
