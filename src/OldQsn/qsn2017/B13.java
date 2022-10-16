package OldQsn.qsn2017;

import java.util.Scanner;

interface Shape{
    public abstract void get_data();
    public abstract void display_data();
}

class Rectangle implements Shape{
    double length, breadth, area;
    Scanner sc = new Scanner(System.in);
    @Override
    public void get_data() {
        System.out.println("Enter length");
        this.length = sc.nextDouble();
        System.out.println("Enter breadth");
        this.breadth = sc.nextDouble();
    }

    @Override
    public void display_data() {
        area = length * breadth;
        System.out.println("Area of rectangle = "+area);
    }
}

class Square implements Shape{
    double length, area;
    Scanner sc = new Scanner(System.in);

    @Override
    public void get_data() {
        System.out.println("Enter length");
        this.length = sc.nextDouble();
    }

    @Override
    public void display_data() {
        area = length * length;
        System.out.println("Area of Square = "+area);
    }
}

public class B13 {
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle();
        Square obj2 = new Square();
        obj1.get_data();
        obj1.display_data();
        obj2.get_data();
        obj2.display_data();
    }
}
