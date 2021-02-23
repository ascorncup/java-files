import java.util.Scanner;
public class splittDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[5] = sc.nextInt();
        for(int i=0; i<5;i++){
            int num2[i] = num.split();
        }
        for(i=0; i<5; i++){
            System.out.println(num2[i]);
        }
                
    }
}
