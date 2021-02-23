import java.util.*;
public class twoDimentionalArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0; j<3;j++){
                System.out.println("Array["+i+"] ["+j+"]: ");
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Resultant matrix: ");
        for(i=2;i>-1;i--){
            for(j=0; j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
