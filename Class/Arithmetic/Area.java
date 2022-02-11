import java.util.Scanner;
class Area {
   public static void main(String[] args) {

       int length=10,breadth=5,area;

       Scanner in = new Scanner(System.in);
       System.out.print("Enter length of rectangle = ");
       length = in.nextInt();
       System.out.print("Enter breadth of rectangle = ");
       breadth = in.nextInt();

       System.out.println("\nLength = " + length);
       System.out.println("Height = " + breadth);

       area = (length * breadth);

       System.out.println("\nArea of Rectangle = " + area);
       in.close(); 
    }
}