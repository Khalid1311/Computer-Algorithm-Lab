/* Given two matrices A (Dimension m*n) and B (Dimension n*p), perform matrix multiplication and
   return the resulting matrix.
*/

import java.util.Scanner;

public class prb4 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter dimensions M, N, P : ");
        int m = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();
        
        int[][] matrixA = new int[m][n];       
        System.out.println("Enter the elements of the matrix A : ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elements["+(i+1)+"]["+(j+1)+"] : ");
                matrixA[i][j] = in.nextInt();
            }
        }    
        
        int[][] matrixB = new int[n][p];
        System.out.println("Enter the elements of the matrix B : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("Elements["+(i+1)+"]["+(j+1)+"] : ");
                matrixB[i][j] = in.nextInt();
            }
        }    
        
        int[][] matrixC = new int[m][p];   
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    matrixC[i][j] += matrixA[i][k]*matrixB[k][j];
                }                
            }
        }
        
        System.out.println("The matrixC is : ");        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
