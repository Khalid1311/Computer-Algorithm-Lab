
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        boolean swapped;

        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        System.out.print("Array after Bubble Sort : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
