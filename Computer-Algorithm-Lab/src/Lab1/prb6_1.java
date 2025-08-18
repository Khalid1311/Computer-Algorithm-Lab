/* Given an array, move all 0s to the end of the array without changing the order of the other elements.
   Example:
   nums = [0, 1, 0, 3, 12]
   Output: [1, 3, 12, 0, 0]
*/

import java.util.Scanner;

public class prb6_1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = in.nextInt();
        
        int[] array = new int[size];        
        System.out.print("Enter the array elements : ");        
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            if(array[i] != 0){
                
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }            
        }
        
        for(int num : array){
            System.out.print(num + " ");
        }      
        System.out.println();
    }
}
