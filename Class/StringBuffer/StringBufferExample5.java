class StringBufferExample5 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.reverse();// now original string is changed
        System.out.println(sb);// prints HJavaello
    }
}