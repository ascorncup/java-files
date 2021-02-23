import java.util.Scanner;
public class operatorsInJava {
    public static void main(String[] args){
        System.out.println("Enter three numbers to find out the largest of them: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3){ //using Logical AND (&&) operators
            System.out.println("Largest: "+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("Largest: "+n2);
        }
        else{
            System.out.println("Largest: "+n3);
        }
        System.out.println("Hollow square pattern is being printed below: ");
        int r,c;
        for(r=1;r<=4;r++){
            for(c=1;c<=4;c++){
                
                if (r == 1 || c == 4 ||  
                    c == 1 || r == 4)             
                    System.out.print("* ");             
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
