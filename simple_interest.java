import java.util.Scanner;
public class simple_interest {
    public static void main(String args[]){
        double si, p;
        float t, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        p = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        r = sc.nextFloat();
        System.out.println("Enter time period: ");
        t = sc.nextFloat();

        si = (p*t*r)/100;
        System.out.println("Principal: " + p);
        System.out.println("Interest Rate: " + r);
        System.out.println("Time Duration: " + t);
        System.out.println("Simple interest: "+si);
        
    }
}
