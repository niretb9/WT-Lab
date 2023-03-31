import java.util.Scanner;
public class fibonacci{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the number of terms: ");
      int n = input.nextInt();
      int first = 0, second = 1, next;
      System.out.print(first + " " + second);
      for (int i = 2; i < n; i++) {
        next = first + second;
        System.out.print(" " + next);
        first = second;
        second = next;
      }
      System.out.println();
    }
  }
}
