class Counteven {
    static int length;

    public static void printArray(int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int sortArray(int[] array) {
        int c = 0;
        for (int i = 1; i < length; i++) {
            if (array[i] % 2 == 0)
                c = c + 1;
        }
        return (c);
    }

    public static void main(String[] args) {
        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
        length = array.length;
        System.out.print("Elements of original array: ");
        printArray(array);
        int gr = sortArray(array);
        System.out.println("Total even numbers: " + gr);
    }
}