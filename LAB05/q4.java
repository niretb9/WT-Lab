//Program to find no. of objects created out of a class using „static‟ modifier.
package LAB05;
import java.util.Scanner;
public class q4{
    static int count = 0;
    public q4() {
        count++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects to be created: ");
        int n = sc.nextInt();
        q4[] objects = new q4[n];
        for (int i = 0; i < n; i++) {
            objects[i] = new q4();
        }
        System.out.println("Number of objects created: " + q4.count);
        sc.close();
    }
}
