class Smallarrayelement
{
static int length;
public static void printArray(int[] array)
{
for (int i = 0; i < length; i++)
{
System.out.print(array[i] + " ");
}
System.out.println();
}
public static int sortArray(int[] array)
{
int temporary = array[0];;
for (int i = 1; i < length; i++)
{
if(array[i] < temporary )
temporary=array[i];
}
return (temporary);
}

public static void main(String[] args)
{
int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
length = array.length;
System.out.print("Elements of original array: ");
printArray(array);
int gr=sortArray(array);
System.out.print("Greatest value: "+gr);
}
}