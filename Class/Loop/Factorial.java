
import java.util.Scanner;

class facto {
    int i, fact = 1;
    int number;

    void get(int a) {
        number = a;
    }

    void cal() {
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
    }

    void display() {
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

public class Factorial {

    public static void main(String args[]) {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = ob.nextInt();
        facto OBJ = new facto();
        OBJ.get(n);
        OBJ.cal();
        OBJ.display();
        ob.close();
    }
}

