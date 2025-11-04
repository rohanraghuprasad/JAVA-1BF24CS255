import java.util.Scanner;
class InputScanner
{
    Scanner sc=new Scanner(System.in);
}
abstract class Shape extends InputScanner
{
    int dim1, dim2;
    abstract void printArea();
}
class Rectangle extends Shape
{
    void printArea()
    {
        System.out.println("Enter length of rectangle: ");
        dim1=sc.nextInt();
        System.out.println("Enter breadth of rectangle: ");
        dim2=sc.nextInt();
        double a=dim1*dim2;
        System.out.println("Area of rectangle: "+ a);
    }
    
}
class Triangle extends Shape
{
    void printArea()
    {
        System.out.println("Enter base of triangle: ");
        dim1=sc.nextInt();
        System.out.println("Enter height of triangle: ");
        dim2=sc.nextInt();
        double a=0.5*dim1*dim2;
        System.out.println("Area of triangle: "+ a);
    }
}
class Circle extends Shape
{
    void printArea()
    {
        System.out.println("Enter radius of circle: ");
        dim1=sc.nextInt();
        double a=Math.PI*dim1*dim1;
        System.out.println("Area of circle: "+a);
    }
}

public class classMain
{
    public static void main(String [] args)
    {
        Rectangle ob1=new Rectangle();
        ob1.printArea();
        System.out.println();
        Triangle ob2=new Triangle();
        ob2.printArea();
        System.out.println();
        Circle ob3=new Circle();
        ob3.printArea();
        System.out.println();
    }
}