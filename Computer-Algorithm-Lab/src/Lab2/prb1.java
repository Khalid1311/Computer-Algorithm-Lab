/*
  Given a non-negative integer n, find the largest integer x such that x2 ≤ n. You cannot use built-in square root 
 functions.
 Example: Input: n=10
          Output: 3
*/

import java.util.Scanner;

public class prb1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter non negative number : ");
        int num = in.nextInt();
        
        int lo = 0;
        int hi = num;
        int ans = 0;
        while(lo<=hi){
            
            int mid = lo + (hi-lo)/2;
            
            if(mid*mid <= num){
                lo = mid+1;
                ans = mid;
            }
            else{
                hi = mid-1;
            }            
        }
        System.out.println("Largest x such that x^2 " + num + " is: " + ans);
    }
}
