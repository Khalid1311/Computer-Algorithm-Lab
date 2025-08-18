/* Given an array of integers nums and a target value target, return the indices of the two numbers that add up to 
  the target.
  Example: nums = [2, 7, 11, 15], target = 9
  Output: [0, 1] (because nums[0] + nums[1] == 9)
*/

import java.util.Scanner;

public class prb5 {  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] array = {2,7,11,15};
        System.out.print("Array Number Elements : ");
        for(int num : array){
            System.out.print(num+" ");
        }            
        System.out.println();
        
        System.out.print("Enter the Target number : ");
        int target = in.nextInt();
        
        int[] result = new int[2];
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        
        if (result != null) {
            System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: " + array[result[0]] + " + " + array[result[1]] + " = " + target);
        } 
        else {
            System.out.println("No two sum solution found.");
        }
    }
}

