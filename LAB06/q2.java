//Write a program to overload subtract method with various parameters in a class in Java
package LAB06;
public class q2 {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        q2 calc = new q2();

        System.out.println(calc.subtract(15, 5)); 
        System.out.println(calc.subtract(1.8, 2.5)); 
        System.out.println(calc.subtract(17, 6, 2)); 
    }
}
