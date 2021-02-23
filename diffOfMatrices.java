import java.util.*;
public class diffOfMatrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int sizeMatrix = sc.nextInt();
        int i,j;
        int[][] array1 = new int[sizeMatrix][sizeMatrix];
        System.out.println("Enter the elements of the first matrix: ");
        for(i=0;i<sizeMatrix;i++){
            for(j=0;j<sizeMatrix;j++){
                System.out.println("array["+i+"] ["+j+"] : " );
                array1[i][j] = sc.nextInt();
            }
        }
        int[][] array2 = new int[sizeMatrix][sizeMatrix];
        System.out.println("Enter the elements of the second matrix: ");
        for(i=0;i<sizeMatrix;i++){
            for(j=0;j<sizeMatrix;j++){
                System.out.println("array["+i+"] ["+j+"] : " );
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] resultMatrix = new int[sizeMatrix][sizeMatrix];
        for(i=0;i<sizeMatrix;i++){
            for(j=0;j<sizeMatrix;j++){
                resultMatrix[i][j] = array1[i][j] - array2[i][j];
            }
        }
        System.out.println("Resultant matrix: ");
        for(i=0;i<sizeMatrix;i++){
            for(j=0;j<sizeMatrix;j++){
                System.out.print(resultMatrix[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
