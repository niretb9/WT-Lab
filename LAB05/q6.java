/*Find sum of each diagonal (left & right) elements separately of a user entered 3
X 3 matrixes in Java.*/
package LAB05;
import java.util.Scanner;
public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int leftDiaSum = 0;
        int rightDiaSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiaSum += matrix[i][i];
            rightDiaSum += matrix[i][2 - i];
        }
        System.out.println("Left Diagonal Sum: " + leftDiaSum);
        System.out.println("Right Diagonal Sum: " + rightDiaSum);
    }
}
