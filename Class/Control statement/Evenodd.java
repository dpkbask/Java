class Evenodd {

    // Returns true if n is even, else odd
    static boolean  isEven(int n){

        // n&1 is 1, then odd, else even
        //return((n&1)!=1);//method 1 using bitwise and operator

        if ((n | 1) > n)//method 2 using bitwise or operator
            return true;
        else
            return false;
    }

    // Driver code
    public static void main(String[] args) {
       int n =3;
       System.out.println(isEven(n)==true?"Even":"Odd"); 
    }
}
