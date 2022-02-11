
import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void setValue(int l, int b) {
        length = l;
        breadth = b;
    }

    // get area of rectangle
    int findArea() {
        return (length * breadth);
    }
}

class Arearect {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1:");
        a = sc.nextInt();
        System.out.println("Enter side2:");
        b = sc.nextInt();
        obj.setValue(a, b);
        //obj.setValue(10, 5);
        System.out.println("Area of rectangle: " + obj.findArea());
        sc.close();
    }
}
