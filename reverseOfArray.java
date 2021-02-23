import java.util.*;

public class reverseOfArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int b : a) {
            System.out.print(b + ", ");
        }
        System.out.println();
        System.out.println("Reverse of an array: ");
        for (i = 4; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("\n Odd and even: \n");
        for (i = 0; i < 5; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(20 + a[i] + "  ");
            } else {
                System.out.print(a[i] + "  ");
            }
        }
    }
}