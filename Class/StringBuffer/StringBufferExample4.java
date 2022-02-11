class StringBufferExample4 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.replace(1,3, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello
    }
}