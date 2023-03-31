/*Illustrate the execution of constructors in multi-level inheritance with three
Java classes - plate(length, width), box(length, width, height), wood box
(length, width, height, thick) */
package LAB07;
import java.util.Scanner;
class plate{
    int length;
    int breadth;
    Scanner ob = new Scanner(System.in);
    public plate(){
        System.out.println("Enter dimensions a : ");
        length = ob.nextInt();
        System.out.println("Enter dimensions b : ");
        breadth = ob.nextInt();
    }
}
class box extends plate{
    int height;
    public box(){
        super();
        System.out.print("Enter dimension c : ");
        height = ob.nextInt();
    }
}
class wood_box extends box{
    int thick;
    public wood_box(){
        super();
        System.out.println("Enter dimension d : ");
        thick = ob.nextInt();
    }
}
public class q2{
    public static void main(String args[]){
        plate p = new plate();
        System.out.println("Dimensions of plate are : "+p.length+","+p.breadth);
        box b = new box();
        System.out.println("Dimensions of box are : "+b.length+","+b.breadth+","+b.height);
        wood_box wb = new wood_box();
        System.out.println("Dimensions of wood_box are : "+wb.length+","+wb.breadth+","+wb.height+","+wb.thick);
    }
}