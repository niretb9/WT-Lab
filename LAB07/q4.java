/*Write a program in java to define a class Shape which has data member ,,area" and a
member function showArea(). Derive two classes Circle and Rectangle from Shape
class. Add appropriate data members and member functions to calculate and display
the area of Circle and Rectangle. */
package LAB07;
import java.lang.Math;
class Shape {
    protected double area;
    public void showArea() {
        System.out.println("Area of shape is " + area);
    }
}
class Circle extends Shape {
    public Circle(double radius) {
        area = Math.PI * radius * radius;
    }
    public void showArea() {
        System.out.println("Area of circle is " + area);
    }
}
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        area = length * width;
    }
    public void showArea() {
        System.out.println("Area of rectangle is " + area);
    }
}
public class q4 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.showArea();
        Rectangle r = new Rectangle(4, 6);
        r.showArea();
    }
}
