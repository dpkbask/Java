
import java.util.Scanner;

class facto6 {
    private int i, fact = 1;
    private int number;

    int cal() {
        do {
            fact = fact * i;
            i++;
        } while (i <= number);
        return fact;
    }

    void get(int a) {
        number = a;
        i = 1;
    }

    void display() {
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

class Factorial6 {
    public static void main(String args[]) {
        int n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = ob.nextInt();
        facto6 OBJ = new facto6();
        OBJ.get(n);
        System.out.println("Factorial = " + OBJ.cal());
        ob.close();
    }
}