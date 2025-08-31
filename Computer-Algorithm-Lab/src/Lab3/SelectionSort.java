
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = in.nextInt();

        System.out.print("Enter array elements : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.print("Array after Selection Sort : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
