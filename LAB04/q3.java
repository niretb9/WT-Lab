//Program to print the corresponding week day for the given day no. of the current
//month using switch..case statement in Java
import java.util.Scanner;
public class q3{
    public static void main(String args[]){
        int n;
        System.out.println("Enter any number between 1 to 7");
        try(Scanner obj = new Scanner(System.in))
        {
        n = obj.nextInt();
        switch(n){
            case 1:
            System.out.println("It's Monday");
            break;
            case 2:
            System.out.println("It's Tuesday");
            break;
            case 3:
            System.out.println("It's Wednesday");
            break;
            case 4:
            System.out.println("It's Thursday");
            break;
            case 5:
            System.out.println("It's Friday");
            break;
            case 6:
            System.out.println("It's Saturday");
            break;
            case 7:
            System.out.println("It's Sunday");
            break;
            default:
            System.out.println("Wrong input");
        }
    }
  }
}