/*
Given an integer n, determine the number of trailing zeroes in the factorial of n (n!).A trailing zero is defined as 
a zero that appears at the end of a number, after the last non-zero digit. For example,1200 has two trailing zeroes.
You must design an efficient algorithm that avoids direct computation of n!, since factorial values grow extremely 
large for even moderate values of n. Instead, focus on analyzing the factors that contribute to trailing zeroes.

Input : 
A single integer n (1≤n≤10^9)

Output : 
An integer representing the number of trailing zeroes in n!

Example :

Input :      Output : 
10           2

Explanation: 10!=3,628,800, which has 2 trailing zeroes.
*/
import java.util.Scanner;

public class prb3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the N number : ");
        int n = in.nextInt();

        int count = 0;
        while (n > 0) {

            n = n / 5;
            count += n;
        }
        System.out.println("The result : " + count);
    }
}
