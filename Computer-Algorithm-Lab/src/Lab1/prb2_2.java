/*To print the Floyd’s Triangle till n number of user input:

1
01
101
0101
10101
*/

import java.util.Scanner;

public class prb2_2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter N number : ");
        int n = in.nextInt();
        int num;
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                num = 0;
            }
            else{
                num = 1;
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num = 1-num;
            }
            System.out.println();
        }
    }
}
