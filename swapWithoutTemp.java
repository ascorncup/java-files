import java.util.Scanner;
public class swapWithoutTemp {
    public static void main(String[] args){
        System.out.println("THIS PROGRAM WORKS WITHOUT USING TEMP VARIABLE");
        System.out.println("Enter two numbers to be swapped: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before swapping: first number = "+num1+", second number= "+num2);
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("After swapping: first number = "+num1+", second number= "+num2);
    }
}

