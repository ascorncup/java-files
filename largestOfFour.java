import java.util.Scanner;
public class largestOfFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four number to find the largest of them: ");
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>b){
            if(a>c && a>d){
                System.out.println(a+" is the largest!");//4123
            }
            else if(d>c){
                System.out.println(d+" is the largest!");//3124
            }
            else{
                System.out.println(c+" is the largest!");//3142
            }
        }
        else if(b>c){
            if(b>d){
                System.out.println(b+" is the largest!");//1423
            }
            else{
                System.out.println(d+" is the largest!");//1324
            }
        }
        else if(c>d){
            System.out.println(c+" is the largest!");//1243
        }
        else{
            System.out.println(d+" is the largest!");//1234
        }
    }
}
