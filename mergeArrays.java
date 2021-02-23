import java.util.Scanner;
import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        System.out.println("Enter the size of first array: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        int i = 0;
        System.out.println("Enter the elements of the first array: ");
        for (i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        int size1 = array1.length;
        int size2 = array2.length;
        int size3 = size1 + size2;
        int[] result = new int[size3];
        System.arraycopy(array1, 0, result, 0, size1);
        System.arraycopy(array2, 0, result, size1, size2);
        System.out.println("Resultant array that is being merged: ");
        for (i = 0; i < size3; i++) {
            System.out.println(result[i]);
        }
        System.out.println("\n\n");
        System.out.println("Resultant array that is being sorted: ");
        Arrays.sort(result);
        for (i = 0; i < size3; i++) {
            System.out.println(result[i]);
        }
    }
}
