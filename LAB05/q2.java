/*Accept 10 numbers from command line and check how many of them are even
and how many odd.*/
package LAB05;
import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
         sc.close();
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}