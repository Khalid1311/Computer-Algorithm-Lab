//To Display n number of natural numbers and their sum.

import java.util.Scanner;

public class prb1 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the N natural number : ");
        int n = in.nextInt();
        int sum =0; 
        
        System.out.print("The First "+n+" natural numbers are: ");                
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println();
        System.out.println("Sum of N natural numbers : "+sum);
    }
}
