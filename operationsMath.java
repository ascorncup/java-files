import java.util.Scanner;

public class operationsMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        char ch;
        System.out.println("Enter the choice: ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println("Sum: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Difference: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Product: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Quotient: " + (num1 / num2));
                break;

            case '%':
                System.out.println("Modulo : " + (num1 % num2));
                break;

            default:
                System.out.println("Wrong choice!");

        }
    }
}
