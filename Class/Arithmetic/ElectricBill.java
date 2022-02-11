import java.util.Scanner;

class ElectricBill {

    int units;
    String name;
    double bill;

    void accept(int u, String n) {
        name = n;
        units = u;
    }

    double calculate() {
        if (units <= 100) {
            return 2 * units;
        } else if (units > 100 && units <= 300) {
            return 2 * 100 + (units - 100) * 3;
        } else{
            return 2 * 100 + 3 * 200 + (units - 300) * 5;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        String n = in.nextLine();
        System.out.println("Enter the number of units consumed");
        int units = in.nextInt();
        
        ElectricBill ob = new ElectricBill();
        ob.accept(units,n);
        System.out.println("Your bill is "+ ob.calculate());
        in.close();
    }
}
