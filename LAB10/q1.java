/*Write an interface Numbers with a method int process
(int x, int y). Write a class Sum in which the process()
method finds the sum of two numbers and returns an int
value. Write another class Average in which the process()
method finds the average of the two numbers and returns
an int value. Implement an application class Demo where
the functionality of above two classes are tested that
exhibit run time polymorphism. */
// Numbers interface
package LAB10;
interface Numbers{
    int process(int x, int y);
}
class Sum implements Numbers {
    public int process(int x, int y) {
        return x + y;
    }
}
class Average implements Numbers {
    public int process(int x, int y) {
        return (x + y) / 2;
    }
}
public class q1 {
    public static void main(String[] args) {
        Numbers sum = new Sum();
        Numbers average = new Average();
        int x = 10;
        int y = 20;
        int sumResult = sum.process(x, y);
        System.out.println("Sum of " + x + " and " + y + " is " + sumResult);
        int averageResult = average.process(x, y);
        System.out.println("Average of " + x + " and " + y + " is " + averageResult);
    }
}