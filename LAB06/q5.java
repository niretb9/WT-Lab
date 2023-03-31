/*Write a program in java to input and display the details of n number of
students having roll, name and cgpa as data members. Also display the name of the
student having lowest cgpa */
package LAB06;
import java.util.Scanner;
public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] rolls = new int[n];
        double[] cgpa = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the details of student %d:%n", i+1);
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Roll: ");
            rolls[i] = sc.nextInt();
            System.out.print("CGPA: ");
            cgpa[i] = sc.nextDouble();
        }
        int lowestIndex = 0;
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < cgpa[lowestIndex]) {
                lowestIndex = i;
            }
        }
        System.out.printf("Details of all %d students:%n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d:%n", i+1);
            System.out.printf("Name: %s%n", names[i]);
            System.out.printf("Roll: %d%n", rolls[i]);
            System.out.printf("CGPA: %.2f%n", cgpa[i]);
            System.out.println();
        }
        System.out.printf("Student with lowest CGPA: %s%n", names[lowestIndex]);
        sc.close();
    }
}