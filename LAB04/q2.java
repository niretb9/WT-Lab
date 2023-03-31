//Program to print the corresponding grade for the given mark using if..else
//statement in Java
import java.util.Scanner;

public class q2{
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter your mark: ");
      int mark = sc.nextInt();
  
      if (mark >= 90){
        System.out.println("Grade: A");
      } else if (mark >= 80) 
      {
        System.out.println("Grade: B");
      } else if (mark >= 70) 
      {
        System.out.println("Grade: C");
      } else if (mark >= 60) {
        System.out.println("Grade: D");
      } else {
        System.out.println("Grade: F");
      }
    }
  }
}
