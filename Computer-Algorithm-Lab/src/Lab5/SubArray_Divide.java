
import java.util.Scanner;

public class SubArray_Divide {

    public static int Crossmax(int[] array, int left, int mid, int right) {
        int leftsum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = mid; i >= left; i--) {
            sum += array[i];
            leftsum = Math.max(leftsum, sum);
        }

        int rightsum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += array[i];
            rightsum = Math.max(rightsum, sum);
        }

        return leftsum + rightsum;
    }

    static int Maximum_SubArray(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        } else {
            int mid = (left + right) / 2;
            int leftmax = Maximum_SubArray(array, left, mid);
            int rightmax = Maximum_SubArray(array, mid + 1, right);
            int crossmax = Crossmax(array, left, mid, right);

            return Math.max(leftmax, Math.max(rightmax, crossmax));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int Max_Sum = Maximum_SubArray(array, 0, size - 1);
        System.out.println("The sum: " + Max_Sum);
    }
}
