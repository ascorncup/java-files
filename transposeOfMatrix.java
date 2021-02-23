import java.util.*;
public class transposeOfMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the size of matrix: ");
        int sizeMatrix = sc.nextInt();*/
        System.out.println("Enter the number of rows of matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of matrix: ");
        int col = sc.nextInt();
        int i,j;
        int[][] array = new int[row][col];
        System.out.println("Enter the elements of the first matrix: ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.println("array["+i+"] ["+j+"] : " );
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array that you entered: ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Resultant transpose matrix: ");
        for(j=0;j<col;j++){
            for(i=0;i<row;i++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }     
        /*The below code does't works....!
               
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }*/
    }
}
