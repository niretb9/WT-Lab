/*Write a program to perform following operations on user entered strings –

i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string */
package LAB09;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1, str2, str3;
        int choice;
        do {
            System.out.println("1. Change case of a string");
            System.out.println("2. Reverse a string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another string");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    input.nextLine(); 
                    str1 = input.nextLine();
                    System.out.print("Enter 1 for UPPERCASE or 2 for lowercase: ");
                    int option = input.nextInt();
                    if (option == 1) {
                        System.out.println("Result: " + str1.toUpperCase());
                    } else if (option == 2) {
                        System.out.println("Result: " + str1.toLowerCase());
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    input.nextLine(); 
                    str1 = input.nextLine();
                    str2 = new StringBuilder(str1).reverse().toString();
                    System.out.println("Result: " + str2);
                    break;
                case 3:
                    System.out.print("Enter first string: ");
                    input.nextLine(); 
                    str1 = input.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = input.nextLine();
                    if (str1.equals(str2)) {
                        System.out.println("The strings are equal");
                    } else {
                        System.out.println("The strings are not equal");
                    }
                    break;
                case 4:
                    System.out.print("Enter the main string: ");
                    input.nextLine();
                    str1 = input.nextLine();
                    System.out.print("Enter the string to be inserted: ");
                    str2 = input.nextLine();
                    System.out.print("Enter the position to insert: ");
                    int position = input.nextInt();
                    str3 = str1.substring(0, position) + str2 + str1.substring(position);
                    System.out.println("Result: " + str3);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        input.close();
    }
}