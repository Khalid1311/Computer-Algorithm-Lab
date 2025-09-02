/*
Kmes has written three integers a, b and c in order to remember that he has to give Noobish_Monk a×b×c bananas. 
Noobish_Monk has found these integers and decided to do the following at most 5 times:
   1.pick one of these integers;
   2.increase it by 1.
For example, if a=2, b=3 and c=4, then one can increase a three times by one and increase b two times. After that a=5, 
b=5, c=4. Then the total number of bananas will be 5×5×4=100.
What is the maximum value of a×b×c Noobish_Monk can achieve with these operations?

Input : 
Each test contains multiple test cases. The first line of input contains a single integer t (1≤t≤1000) — the number 
of test cases. The description of the test cases follows.The first and only line of each test case contains three 
integers a, b and c (1≤a,b,c≤10) — Kmes's integers.

Output :
For each test case, output a single integer — the maximum amount of bananas Noobish_Monk can get.

Example :
Input       Output :
2           
2 3 4       100
10 1 10     600
*/
import java.util.Scanner;

public class Prb1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Three number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a <= b && a <= c) {
                a++;
            } else if (b <= a && b <= c) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println("The Maximum value : " + (a * b * c));
    }
}
