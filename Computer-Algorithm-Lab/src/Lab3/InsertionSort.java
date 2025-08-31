
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = in.nextInt();

        System.out.print("Enter array elements : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.print("New Array after Bubble Sort : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
