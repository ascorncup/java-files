import java.util.*;
public class whileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        int i=1;
        if(limit>=1){
            do{
                System.out.println("Odd numbers in the given range is: ");
                System.out.println(i);
                i+=2;
            }while(i<=limit);
        }
        else{
            System.out.println("Enter positive numbers");
        }
    }
}
