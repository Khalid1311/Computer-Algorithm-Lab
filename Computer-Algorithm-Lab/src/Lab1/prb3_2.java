//Rewrite the previous problem to make the row parameter of the matrix as a default argument.

import java.util.Scanner;

public class prb3_2 {
    
    public static void readmatrix(int[][] matrix, int n) {
        readmatrix(matrix, 3, n); 
    }
    
    public static void readmatrix(int[][] matrix,int m,int n){        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elements["+(i+1)+"]["+(j+1)+"] : ");
                matrix[i][j] = in.nextInt();
            }
        }       
    }
    
    public static void display(int[][] matrix, int n) {
        display(matrix, 3, n);
    }
    
    public static void display(int[][] matrix,int m,int n){
        
        System.out.println("The Matrix is : ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }     
    }    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the N matrix columns number : ");
        int n = in.nextInt();
        
        int[][] matrix = new int[3][n];
        
        readmatrix(matrix,n);
        display(matrix,n);        
    }
}
