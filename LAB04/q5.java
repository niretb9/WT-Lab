//Write a program in Java to take first name and last name from user and print both in
//one line as last name followed by first name.
import java.util.Scanner;
public class q5 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter your first name: ");
      String firstName = input.nextLine();
      System.out.print("Enter your last name: ");
      String lastName = input.nextLine();
      System.out.println(lastName + ", " + firstName);
    }
  }
}
