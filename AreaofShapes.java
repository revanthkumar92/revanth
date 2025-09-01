import java.util.*;
abstract class shape{
 public int x,y;
public abstract void printarea();
}
class Rectangle extends shape{
public void printarea(){
float area;
area=x*y;
System.out.println("Area of the Rectangle is:"+area);
}
}
class Traingle extends shape{
public void printarea(){
float area;
area=(x*y)/2.0f;
System.out.println("Area of the Traingle is:"+area);
}
}
class Circle extends shape{
public void printarea(){
float area;
area=(22*x*x)/7.0f;
System.out.println("Area of the Circle is:"+area);
}
}
public class AreaofShapes{
public static void main(String[] args){
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("MENU\n 1.Area of the Rectangle 2.Area of the Traingle 3.Area of the Circle");
System.out.println("enter your choice:");
choice=sc.nextInt();
switch (choice) {
    case 1 -> {
        System.out.println("enter the length and breadth for the area of the rectangle:");
        Rectangle r = new Rectangle();
        r.x = sc.nextInt();
        r.y = sc.nextInt();
        r.printarea();
    }
    case 2 -> {
        System.out.println("enter the breadth and height for the area of the traingle:");
        Traingle t = new Traingle();
        t.x = sc.nextInt();
        t.y = sc.nextInt();
        t.printarea();
    }
    case 3 -> {
        System.out.println("enter the radius for the area of the circle:");
        Circle c = new Circle();
        c.x = sc.nextInt();
        c.printarea();
    }
    default -> System.out.println("enter a valid choice:");
}
}
}

