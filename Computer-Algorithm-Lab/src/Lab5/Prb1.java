
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
