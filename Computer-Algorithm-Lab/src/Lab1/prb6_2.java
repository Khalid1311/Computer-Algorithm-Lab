/* Given an array of n + 1 integers where each integer is between 1 and n (inclusive), find the duplicate number.
   Example: nums = [1, 3, 4, 2, 2]
            Output: 2
*/

import java.util.Scanner;

public class prb6_2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = in.nextInt();
        
        int[] array = new int[size];        
        System.out.print("Enter the array elements : ");        
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        
        int duplicate = -1;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                
                if(array[i] == array[j]){
                    duplicate = array[i];
                }                
            }              
        }
        
        if(duplicate !=-1){
            System.out.println("Duplicate Number : "+duplicate);
        }
        else{
            System.out.println("Not Duplicate Number");
        }
    }
}
