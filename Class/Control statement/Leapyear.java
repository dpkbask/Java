import java.util.Scanner;

class Result {
    boolean leap = false;

    boolean isLeapYear(int year) {
        if (year % 4 == 0) {

            if (year % 100 == 0) {
                
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        return leap;
    }
}

class Leapyear {
    public static void main(String[] args) {
        Result obj = new Result();
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        year = sc.nextInt();
        System.out.println(obj.isLeapYear(year)==true?"Leap Year":"Not a Leap Year"); 
        sc.close();
    }
}
