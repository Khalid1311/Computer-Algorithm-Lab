
import java.util.Scanner;

public class Prb3 {

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
