class Add10ToArrayElemt {
    static int length;

    public static void printArray(int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
            array[i] = array[i] + 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
        length = array.length;
        System.out.print("Elements of original array: \n");
        printArray(array);
        printArray(array);
        printArray(array);
    }
}