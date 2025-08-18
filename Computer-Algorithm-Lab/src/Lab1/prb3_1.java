//To read a matrix of size m*n from the keyboard and display the same on the screen using the function.

import java.util.Scanner;

public class prb3_1 {
    
    public static void readmatrix(int[][] matrix,int m, int n){        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elements["+(i+1)+"]["+(j+1)+"] : ");
                matrix[i][j] = in.nextInt();
            }
        }       
    }
    
    public static void display(int[][] matrix,int m,int n){
        
        System.out.println("The Matrix is : ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }     
    }    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the M matrix row number : ");
        int m = in.nextInt();
        System.out.print("Enter the N matrix columns number : ");
        int n = in.nextInt();
        
        int[][] matrix = new int[m][n];
        
        readmatrix(matrix,m,n);
        display(matrix,m,n);        
    }
}
