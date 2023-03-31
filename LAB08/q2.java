/*Define an interface Motor with a data member –capacity and two methods such
as run() and consume(). Define a Java class ,Washing machine‟ which
implements this interface and write the code to check the value of the interface data
member thru an object of the class. */
package LAB08;
import java.util.Scanner;
interface motor {
    int capacity = 0;
    void run();
    void consume();
}
class wm implements motor {
    int capacity;
    public wm(int capacity) {
        this.capacity = capacity;
    }
    public void run() {
        System.out.println("Washing machine is running.");
    }
    public void consume() {
        System.out.println("total power consumed is ");
    }
}
public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter you capacity ");
        int capacity = scanner.nextInt();
        wm washing_machine = new wm(capacity);
        System.out.println("total capacity is " + washing_machine.capacity);
        scanner.close();
    }
}