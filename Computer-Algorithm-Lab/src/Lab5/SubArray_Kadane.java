
import java.util.Scanner;

public class SubArray_Kadane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("The Maximum subarray sum : " + maxSum);
    }
}
