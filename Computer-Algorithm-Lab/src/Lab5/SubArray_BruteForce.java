
import java.util.Scanner;

public class SubArray_BruteForce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += array[j];
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println("The maximum sum : "+max_sum);
    }
}
