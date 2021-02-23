
import java.util.Scanner;

public class newProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amount, rate;
        System.out.println("Enter the deposit amount: ");
        amount = sc.nextFloat();
        System.out.println("Enter the rate of interest: ");
        rate = sc.nextFloat();
        float interest1 = amount * (rate / 100);
        System.out.println("Enter the values for tax: ");
        float tax = sc.nextFloat();
        float taxAmount = interest1 * (tax / 100);
        interest1 = interest1 - taxAmount;
        System.out.println("Interst1:" + interest1);
    }
}