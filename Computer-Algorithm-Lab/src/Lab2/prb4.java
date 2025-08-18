/*
  Given an array of integers, find the index of the first occurrence of a target value x. If the target is not 
  found, return -1.
  Example 1: 
        Input: array = [5, 3, 7, 9, 3] ; x = 3
        Output: 1
*/

import java.util.Scanner;

public class prb4 {
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
        
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(array[i] == target){             
                index = i;  
                break;
            }
        }
        
        if(index !=-1){
            System.out.println("Target index number : "+index);
        }
        else{
            System.out.println("The target is not found");
        }
    }
}
