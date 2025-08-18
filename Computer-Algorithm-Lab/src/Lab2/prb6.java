/*
   Given an array of integers, count the number of times a target value x appears in the array.
   Example 1: Input: array = [2, 4, 2, 8, 2] ; x = 2
              Output: 3
*/

import java.util.Scanner;

public class prb6 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = in.nextInt();
        
        int[] array = new int[size];
        System.out.print("Enter the non negative array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        
        System.out.print("Enter the target number : ");
        int target = in.nextInt();
        
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i] == target){             
                count ++; 
            }
        }        
        System.out.println("The target value : "+target+" of count number : "+count);        
    }
}
