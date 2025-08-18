/*To print the following pattern till n number of user input:

 1
 22
 333
 4444
*/
import java.util.Scanner;

public class prb2_1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter N number : ");
        int n = in.nextInt();
        
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
