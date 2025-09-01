/*
Po, the Dragon Warrior, is training every day to become stronger in Kung-fu. Each day, he earns training points:
• A positive number means he gained training points that day.
• A negative number means he was exhausted and lost points.
• Zero means it was a neutral day — no gain or loss.
Po wants to find his maximum training streak — the contiguous sequence of days where he gained the most total training points.
Input
• The first line contains an integer n (1 ≤ n ≤ 10^5) — the number of training days.
• The second line contains n integers t1, t2, ..., tn (−10^4 ≤ ti ≤ 10^4) — the training points for each day.
Output
• Print the maximum total training points Po can get from a contiguous sequence of days.
Example:
Input
10
-2 3 0 -1 5 -3 2 2 -5 4
Output
8
 */
import java.util.Scanner;

public class Prb2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of training days : ");
        int day = in.nextInt();

        int[] point = new int[day];
        System.out.print("Enter the training points for each day : ");
        for (int i = 0; i < day; i++) {
            point[i] = in.nextInt();
        }

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < day; i++) {
            int sum = 0;
            for (int j = i; j < day; j++) {
                sum += point[j];
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println("The maximum total training points : " + max_sum);
    }
}
