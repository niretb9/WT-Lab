package LAB10;
import java.util.Scanner;
class Circle {
    private double radius;
    public void set_radius(double radius) {
        this.radius = radius;
    }

    public double get_radius(){
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of circle ");
        double radius = sc.nextDouble();
        Circle c = new Circle();
        c.set_radius(radius);
        System.out.println("area " + c.getArea());
        System.out.println("preimeter is " + c.getPerimeter());
    sc.close();
    }
}