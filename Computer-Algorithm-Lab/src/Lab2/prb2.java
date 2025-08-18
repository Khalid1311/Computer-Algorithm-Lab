/*
  Given a sorted array that is rotated at some pivot and a target value x, determine the index of x. If x is not 
  found, return -1.
  Example 1: Input: array = [3, 4, 5, 1, 2]; x = 2
             Output: 4
*/

import java.util.Scanner;

public class prb2 {
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
        
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (array[mid] == target) {
                System.out.println("The target Index Number : "+mid);
            }
            
            if (array[lo] <= array[mid]) {
                if (target >= array[lo] && target < array[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }            
            else {
                if (target > array[mid] && target <= array[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }       
    }
}
