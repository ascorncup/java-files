import java.util.Scanner;
public class tempConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius scale: ");
        float cels = sc.nextFloat();
        float far = cels * (9f / 5 )+32;
        System.out.println("Temperature converted to Fahrenheit is: "+ far);
    }
}
