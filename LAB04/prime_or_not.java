import java.util.Scanner;

public class prime_or_not{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      boolean isPrime = true;
      for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(number + " is a prime number.");
      } else {
        System.out.println(number + " is not a prime number.");
      }
    }
  }
}
