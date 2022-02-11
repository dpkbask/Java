import java.util.Scanner;

class facto2 {
    int i, fact = 1;
    int number;

facto2(int a)
{
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

public class Factorial2 {
    public static void main(String args[]) {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = ob.nextInt();
        facto2 OBJ = new facto2(n);
        OBJ.cal();
        OBJ.display();
        ob.close();
    }
}
