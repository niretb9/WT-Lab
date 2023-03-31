import java.util.Scanner;

public class prime_factor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    System.out.println("Prime factors of " + number + " are: ");
    for (int i = 2; i <= number; i++) {
      while (number % i == 0) {
        System.out.print(i + " ");
        number /= i;
      }
    }
    sc.close();
  }
}
