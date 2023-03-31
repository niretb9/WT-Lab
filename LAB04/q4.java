//Program to check a user entered number is palindrome or not.
import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int n = sc.nextInt();

      int rev = 0;
      int og = n;
      while (n != 0) {
        int d = n % 10;
        rev = (rev * 10) + d;
        n /= 10;
      }

      if (og == rev) {
        System.out.println(og + " is a palindrome");
      } else {
        System.out.println(og + " is not a palindrome");
      }
    }
  }
}
