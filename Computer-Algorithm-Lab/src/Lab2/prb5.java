/* 
   Given an array of integers, find the maximum value.
   Example 1: Input: array = [1, 7, 3, 9, 5]
              Output: 9
              Example 2: Input: array = [-3, -1, -7, -2]
                         Output: -1
*/

import java.util.Scanner;

public class prb5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = in.nextInt();
        
        int[] array = new int[size];
        System.out.print("Enter the non negative array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }        
        System.out.println("The maximum value : "+max);
    }
}
