package AbstractClass;

import java.util.Scanner;

abstract class Shape {
    public abstract double getArea();
}

class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(double l,double b) {
        this.length =l;
        this.breadth =b;
    }

    @Override
    public double getArea() {
        System.out.println("rectangle...");
        return length * breadth;
    }
}

class Square extends Shape {
    double length;

    public Square(double l) {
        this.length = l;
    }

    @Override
    public double getArea() {
        System.out.println("square...");
        return length * length;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        System.out.println("circle...");
        return radius * radius * 3.14;
    }
}

public class Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //double l,b;
        Shape[] s = new Shape[3];
        String choice=null;
        for (int i = 0; i < s.length; i++) {
            System.out.println("enter choice r for rectangle, s for square and c for cirle");
            choice=sc.next();
            switch (choice)
            {
                case "r":
                {

                    System.out.println("Enter length and breadth");
                    s[i] = new Rectangle(sc.nextDouble(),sc.nextDouble());
                    break;
                }
                case "s":
                {
                    System.out.println("Enter length");
                    s[i] = new Square(sc.nextDouble());
                    break;
                }
                case "c":
                {
                    System.out.println("Enter radius");
                    s[i]=new Circle(sc.nextDouble());
                    break;
                }
            }

        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].getArea());
        }
    }
}
