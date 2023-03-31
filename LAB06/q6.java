/*Write a program to calculate area according to user input, whether it is circle, square
or triangle (Menu Driven). */
package LAB06;
import java.util.Scanner;
public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double r = sc.nextDouble();
                    double circArea = 3.14 * r * r;
                    System.out.printf("Area of the circle: %.2f%n", circArea);
                    break;
                case 2:
                    System.out.print("Enter the side length of the square: ");
                    double l = sc.nextDouble();
                    double sqArea = l * l;
                    System.out.printf("Area of the square: %.2f%n", sqArea);
                    break;
                case 3:
                    System.out.print("Enter the base and height of the triangle, separated by a space: ");
                    double b = sc.nextDouble();
                    double h = sc.nextDouble();
                    double triArea = 0.5 * b * h;
                    System.out.printf("Area of the triangle: %.2f%n", triArea);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 3);
        sc.close();
    }
}
