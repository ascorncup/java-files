import java.util.*;
public class prodOfMatrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep in mind the criteria that number of column in first matrix must be equal to number of rows in second matrix in order to perform matrix multiplication!!\n\n");
        System.out.println("Enter the number of rows of first matrix: ");
        int rowFirst = sc.nextInt();
        System.out.println("Enter the number of columns of first matrix: ");
        int colFirst = sc.nextInt();
        System.out.println("Enter the elements of first matrix: ");
        int i,j;
        int[][] array1 = new int[rowFirst][colFirst];
        for(i=0;i<rowFirst;i++){
            for(j=0;j<colFirst;j++){
                System.out.println("Array ["+i+"] ["+j+"] : ");
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of second matrix: ");
        int rowSecond = sc.nextInt();
        System.out.println("Enter the number of columns of second matrix: ");
        int colSecond = sc.nextInt();
        System.out.println("Enter the elements of second matrix: ");
        int[][] array2 = new int[rowSecond][colSecond];
        for(i=0;i<rowSecond;i++){
            for(j=0;j<colSecond;j++){
                System.out.println("Array ["+i+"] ["+j+"] : ");
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] prod = new int[colFirst][rowSecond];
        
        if(colFirst != rowSecond){
            System.out.println("Told ya! number of rows in second matrix must be equal to number of columns in first matrix..");
        }
        else{
            for( i = 0; i < rowFirst; i++){    
                for( j = 0; j < colSecond; j++){    
                    for(int k = 0; k < rowSecond; k++){    
                       prod[i][j] = prod[i][j] + array1[i][k] * array2[k][j];     
                    }    
                }    
            }
            System.out.println("Product of two matrices: ");    
            for( i = 0; i < rowFirst; i++){    
                for( j = 0; j < colSecond; j++){    
                   System.out.print(prod[i][j] + " ");    
                }    
                System.out.println();    
            }    
            /*for(i=0;i<rowFirst;i++){
                for(j=0;j<colSecond;j++){
                    product[i][j] =  (array1[i][j]*array2[j][i]);
                    System.out.print(product[i][j]  + " ");
                }
                System.out.println();
            }*/
        }
    }
}
