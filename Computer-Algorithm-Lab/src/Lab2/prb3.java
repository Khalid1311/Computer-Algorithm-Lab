/*
  Given a rotated sorted array where all elements are distinct, find the minimum element.
  Example 1: Input: array = [3, 4, 5, 1, 2]
             Output: 1
*/

import java.util.Scanner;

public class prb3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = in.nextInt();
        
        int[] array = new int[size];
        System.out.print("Enter the non negative array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }   
                
        int lo = 0; 
        int hi = size - 1;  
        int min = array[0];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (array[mid] > array[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        min = array[lo];
        System.out.println("Minimum element in rotated sorted array is: " + min);
    }
}
