/*To print out the following pattern till n number of user input:

 *****
 *
 **
 ***
 ****
 *****
*/

import java.util.Scanner;

public class prb2_3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter N number : ");
        int n = in.nextInt();       
        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
